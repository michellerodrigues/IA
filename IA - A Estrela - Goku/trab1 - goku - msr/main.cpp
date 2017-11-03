#include <windows.h>
#include <iostream>
#include <iomanip>
#include <queue>
#include <stack>
#include <string>
#include <math.h>
#include <stdlib.h>
#include <ctime>
using namespace std;
#include "mapa.h"
#include "esferas.h"
#include "grafo.h"
#include "AStar.h"
#include "radar.h"

struct esfera{
	double distMht;//Manhattan dit absoluta 
	int posx;
	int posy;
	int capturada;
};

#define TAMANHO_MAPA 42
#define TAMANHO_GRAFO (TAMANHO_MAPA*TAMANHO_MAPA)
#define TOTAL_RADAR 7
#define ALCANCE_RADAR 3
#define TOTAL_ESFERAS 7
#define TOTAL_VERTICE_RADAR 49
#define TOTAL_PONTOS TAMANHO_GRAFO / TOTAL_VERTICE_RADAR

int**  MatrizAdjacenciaCustos = inicializaMatrizInteiros(TAMANHO_GRAFO, TAMANHO_GRAFO);
int**  MapaCustoColunas;
int**  MapaCusto;//será inicializado em ConfiguraMapaCusto
int**  MapaCustoH;//será inicializado em ConfiguraMapaCusto
int**  dir_map;//será inicializado em ConfiguraMapaCusto
int**  CustoRadar=inicializaMatrizInteiros(TOTAL_RADAR, TOTAL_RADAR);
char** Mapa; //será inicializado em loadMapa
int*   caminhoMaisCurtoTodosVertices;


const int n=42; // horizontal size of the map
const int m=42; // vertical size size of the map
static int map[n][m];
static int closed_nodes_map[n][m]; // map of closed (tried-out) nodes
static int open_nodes_map[n][m]; // map of open (not-yet-tried) nodes
//static int dir_map2[n][m]; // map of directions
const int dir=4; // number of possible directions to go at any position
static int dx[dir]={1, 0, -1, 0};
static int dy[dir]={0, 1, 0, -1};
// if dir==8
//static int dx[dir]={1, 1, 0, -1, -1, -1, 0, 1};
//static int dy[dir]={0, 1, 1, 1, 0, -1, -1, -1};

int main()
{
	Posicao2D* CaminhoPontoMapa;
	CaminhoPontoMapa = (Posicao2D*)malloc(sizeof(Posicao2D)*TAMANHO_GRAFO);
	
	Posicao2D* CaminhoPontoRadar;
	CaminhoPontoRadar = (Posicao2D*)malloc(sizeof(Posicao2D)*TOTAL_VERTICE_RADAR);
	srand(time(NULL));
	grafo* G;
	G = (grafo*)malloc(sizeof(grafo));
	Posicao2D Agente;
	Posicao2D Esfera;
	Agente.x = 19;
	Agente.y = 19;
	int novaPosAgentex = -1;
	int novaPosAgentey = -1;
    // create empty map
    Mapa = LoadMapa("Mapa01.txt",MapaCusto,TAMANHO_MAPA);
	MapaCusto = ConfiguraMapaCusto(TAMANHO_MAPA, Mapa);
	MapaCustoColunas = inicializaMapaCustoColunas(TAMANHO_MAPA, TAMANHO_MAPA, MapaCusto);
	G->matrizAdjacencia= constroiMatrizAdjacenciaPorCusto(MapaCustoColunas, MapaCusto, TAMANHO_MAPA, TAMANHO_GRAFO);
	MatrizAdjacenciaCustos=constroiMatrizAdjacenciaPorCusto(MapaCustoColunas, MapaCusto, TAMANHO_MAPA, TAMANHO_GRAFO);
	esfera* vetEsferas=sortearEsferasProMapa(TOTAL_ESFERAS, TAMANHO_MAPA,Agente.x, Agente.y);
	Posicao2D* vetPontosMapa = pontosExploracaoMapa(TAMANHO_GRAFO,TOTAL_VERTICE_RADAR,TAMANHO_MAPA,TOTAL_RADAR);
	esfera* vetEsferasRadar = inicializarVetorEsferasRadar(TOTAL_ESFERAS);
	CustoRadar = inicializaMatrizInteiros(TAMANHO_MAPA,TAMANHO_MAPA);

	Posicao2D Start;
	Posicao2D Goal;
	Start.x=19;
	Start.y=19;
	Goal.x=25;
	Goal.y=29;
	int totalEsferasPresentesNoRadar=-1;
	int indexVetEsferaPrincipal=-1;

	DesenhaMap(Agente.x, Agente.y, TAMANHO_MAPA, Mapa, vetEsferas, TOTAL_ESFERAS);
	MapaCustoH = inicializaMatrizInteiros(TAMANHO_MAPA,TAMANHO_MAPA);  ;//será inicializado em ConfiguraMapaCusto

	calcularHeuristica_pontosMapa(MapaCustoH,0,0, Goal.x, Goal.y,TAMANHO_MAPA);
	
	//for(int i=0;i<TAMANHO_MAPA;i++)
	//{
	//	for(int j=0;j<TAMANHO_MAPA;j++)
	//	{
	//		printf("%d\t",MapaCustoH[i][j]);
	//	}
	//	//printf("\n");
	//	system("pause");
	//}

	//for(int i=0;i<TAMANHO_MAPA;i++)
	//{
	//	for(int j=0;j<TAMANHO_MAPA;j++)
	//	{
	//		printf("x:%d->y:%d h=%d\t",i,j,MapaCustoH[i][j]);
	//	}
	//	//printf("%d\n");
	//	system("pause");
	//}
	// reset the noFila maps
    /*for(int i=0;i<TAMANHO_GRAFO;i++)
    {
		Caminho2[i].x = -1;
		Caminho2[i].y = -1;
	}*/
	printf("//entrou na A estrela");
	//Caminho = pathFind(Start.x, Start.y, Goal.x, Goal.y,TAMANHO_MAPA,TAMANHO_MAPA,MapaCustoH);
	int xStart = 19;
	int yStart = 19;
	int i=0;
	int w=0;
	int totalEsferaCapturada=0;
	int k=0;
	int indexEsfera=-1; //nenhuma esfera encontrada
	
	while(w<TOTAL_PONTOS ||totalEsferaCapturada<=TOTAL_ESFERAS)
	{
		//CaminhoPontoMapa = pathFind(19, 19, 35, 26,TAMANHO_MAPA,TAMANHO_MAPA,MapaCustoH);
		//resolver problema da passagem de valores, trazer a Astar para a main ou acertar declaração
		//neste caso, como todos os pontos são equidistantes, tando faz a ordem de visita
		CaminhoPontoMapa = pathFind(xStart, yStart, vetPontosMapa[w].x, vetPontosMapa[w].y,TAMANHO_MAPA,TAMANHO_MAPA,MapaCustoH);
		
		//printf("Saiu na A estrela\n");
		//printf("\nGoal até o Start\n Caminho 1a posicao: %d",Caminho2[0].x);
		int total=0;
		
		//acha último elemento
		//printf("\nGoal até o Start\n Caminho 1a posicao: %d",Caminho2[0].x);	
	
		while(CaminhoPontoMapa[w].x>=Start.x && CaminhoPontoMapa[w].x<=TAMANHO_MAPA && CaminhoPontoMapa[w].y>=Start.y && CaminhoPontoMapa[w].y<=TAMANHO_MAPA)
		{
			/*printf("x:%d\t", Caminho2[i].x);
			printf(",y:%d\t", Caminho2[i].y);*/
			//printf("\n");
			w++;
		}
		//printf("\nStart até o Goal\n");

		//verifica ponto visitado, se está numa esfera

		w--;
		Agente.x = CaminhoPontoMapa[w].x; Agente.y = CaminhoPontoMapa[w].y;
		totalEsferasPresentesNoRadar = analisaPresencaEsferaRadarAtual(Agente.x, Agente.y, ALCANCE_RADAR, TOTAL_ESFERAS, vetEsferas, vetEsferasRadar,&indexVetEsferaPrincipal);//analisar limites -3 a 3 a partir do destino para ver se tem esfera
		
		while(totalEsferasPresentesNoRadar==0 && w>=0 )//sem esferas presente, continua caminho
		{	
			DesenhaMap(Agente.x, Agente.x, TAMANHO_MAPA, Mapa, vetEsferas, TOTAL_ESFERAS);
			w++;
			Agente.x = CaminhoPontoMapa[w].x; Agente.y = CaminhoPontoMapa[w].y;
			//vou começar a explorar o mapa, indo até o ponto 1 de 36 pontos...o caminho é longo!			
			totalEsferasPresentesNoRadar = analisaPresencaEsferaRadarAtual(Agente.x, Agente.y, ALCANCE_RADAR, TOTAL_ESFERAS, vetEsferas, vetEsferasRadar,&indexVetEsferaPrincipal);//analisar limites -3 a 3 a partir do destino para ver se tem esfera
		}
		//continuar o camino
	}
	
	
	
	
	
	
	if(//encontrou 1 ou mais esferas no meio do caminho
		//tratando o caso base
			//Que sorte, encontrei a esfera na ilha de kammi, vou continuar procurando...ainda tenho 6 à minha espera!
			indexEsfera = temEsfera(Agente.x, Agente.y, vetEsferas, TOTAL_ESFERAS);
			if(indexEsfera!=-1)
			{
				vetEsferas[indexEsfera].capturada = 1;
				totalEsferaCapturada++;
			}
			
			
			//A cada passo dado, a caminho do ponto desejado, olha a sua volta Radar
			totalEsferasPresentesNoRadar = analisaPresencaEsferaRadarAtual(Agente.x, Agente.y, ALCANCE_RADAR, TOTAL_ESFERAS, vetEsferas, vetEsferasRadar,&indexVetEsferaPrincipal);//analisar limites -3 a 3 a partir do destino para ver se tem esfera
			
			//com otimizaçção if(totalEsferasPresentesNoRadar==1)
			if(totalEsferasPresentesNoRadar==1)
			{
				//Oba, encontrei uma esfera no meu radar, como vou pegá-la?!
				//Qual o melhor caminho?
				ConfiguraCustoRadarMapa(Agente.x, Agente.x, ALCANCE_RADAR,TOTAL_RADAR, CustoRadar,Mapa);
				//novo destino
				Esfera.x = vetEsferasRadar[totalEsferasPresentesNoRadar-1].posx;
				Esfera.y = vetEsferasRadar[totalEsferasPresentesNoRadar-1].posy;
				CaminhoPontoRadar = pathFind(Agente.x, Agente.y, Esfera.x , Esfera.y,TOTAL_RADAR,TOTAL_RADAR,CustoRadar);
				
				//calculo para pegar a volta do caminho
				while(CaminhoPontoRadar[k].x>=Esfera.x && CaminhoPontoRadar[k].x<=TOTAL_RADAR && CaminhoPontoRadar[k].y>=Esfera.y  && CaminhoPontoRadar[k].y<=TOTAL_RADAR)
				{
					k++;
				}
				k--;
				//já encontrei uma rota para pegar esta esfera, vou até lá......depois eu continuo o caminho, a partir do ponto dela!
				while(k>=0) //anda no caminho
				{
					//não é necessário testar outros caminhos pois só tenho 1 esfera no radar.
					DesenhaMap(CaminhoPontoRadar[k].x, CaminhoPontoRadar[k].y, TAMANHO_MAPA, Mapa, vetEsferas, TOTAL_ESFERAS);
				}
				Agente.x = Esfera.x;
				Agente.y = Esfera.y;
	
				vetEsferas[indexVetEsferaPrincipal].capturada=1;
				//sair do loop com essa nova posição
				totalEsferaCapturada++;
			}
			else //não tem esfera no radar vai para próximo ponto do caminho
			{
				if(totalEsferasPresentesNoRadar==0)
				{
					w--;//controlador do caminho. O caminho está invertido, por isso i--. Não consegui faze com pilha!
				}
				else
				{
					//otimizar para mais de 1 esfera encontrada
					//ideia gerar os n caminhos e colocar num heap, desempilhando o menor
				}
			}


		}

	break;
		
		Sleep(1000);
		system("cls");
		i--;
	}


	
	
	

	/*int k=i;
	while((Caminho[k].x)!=-1 && (Caminho[k].y)!=-1)
	{
		printf("x:%d", Caminho[k].x);
		printf("->y:%d\t", Caminho[k].y);
		k--;
	}*/

	

	//cout<<"Caminho: "<<route<<


	//// randomly select start and finish locations
 //   int xA, yA, xB, yB;
 //   switch(rand()%7)
 //   {
 //       case 0: xA=0;yA=0;xB=n-1;yB=m-1; break;
 //       case 1: xA=0;yA=m-1;xB=n-1;yB=0; break;
 //       case 2: xA=n/2-1;yA=m/2-1;xB=n/2+1;yB=m/2+1; break;
 //       case 3: xA=n/2-1;yA=m/2+1;xB=n/2+1;yB=m/2-1; break;
 //       case 4: xA=n/2-1;yA=0;xB=n/2+1;yB=m-1; break;
 //       case 5: xA=n/2+1;yA=m-1;xB=n/2-1;yB=0; break;
 //       case 6: xA=0;yA=m/2-1;xB=n-1;yB=m/2+1; break;
 //       case 7: xA=n-1;yA=m/2+1;xB=0;yB=m/2-1; break;
 //   }

 //   cout<<"Map Size (X,Y): "<<n<<","<<m<<endl;
 //   cout<<"Start: "<<xA<<","<<yA<<endl;
 //   cout<<"Finish: "<<xB<<","<<yB<<endl;
 //   // get the route
 //   clock_t start = clock();
 //   string route=pathFind(xA, yA, xB, yB);
 //   if(route=="") cout<<"An empty route generated!"<<endl;
 //   clock_t end = clock();
 //   double time_elapsed = double(end - start);
 //   cout<<"Time to calculate the route (ms): "<<time_elapsed<<endl;
 //   cout<<"Route:"<<endl;
 //   cout<<route<<endl<<endl;

 //   // follow the route on the map and display it 
 //   if(route.length()>0)
 //   {
 //       int j; char c;
 //       int x=xA;
 //       int y=yA;
 //       map[x][y]=2;
 //       for(int i=0;i<route.length();i++)
 //       {
 //           c =route.at(i);
 //           j=atoi(&c); 
 //           x=x+dx[j];
 //           y=y+dy[j];
 //           map[x][y]=3;
 //       }
 //       map[x][y]=4;
 //   
 //       // display the map with the route
 //       for(int y=0;y<m;y++)
 //       {
 //           for(int x=0;x<n;x++)
 //               if(map[x][y]==0)
 //                   cout<<".";
 //               else if(map[x][y]==1)
 //                   cout<<"O"; //obstacle
 //               else if(map[x][y]==2)
 //                   cout<<"S"; //start
 //               else if(map[x][y]==3)
 //                   cout<<"R"; //route
 //               else if(map[x][y]==4)
 //                   cout<<"F"; //finish
 //           cout<<endl;
 //       }
 //   }
 //   getchar(); // wait for a (Enter) keypress  
   //system("pause");
	return(0);
}