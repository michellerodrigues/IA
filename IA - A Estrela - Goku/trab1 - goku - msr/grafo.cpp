#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "grafo.h"

int** constroiMatrizAdjacenciaPorCusto(int** MapaCustoColunas, int** MapaCusto, int tamanhoMapa, int tamanhoGrafo)
{
	int** MatrizAdjacenciaCustos = inicializaMatrizInteiros(tamanhoGrafo, tamanhoGrafo);
	int total = tamanhoMapa*tamanhoMapa;
	int i,j;
	for(i=0;i<tamanhoMapa;i++)
	{
		for(j=0;j<tamanhoMapa;j++)
		{
				//direita OK
		 	
			int x = MapaCustoColunas[i][j];
			
			//direita OK	

			if(((x+1)%tamanhoMapa)!=0)
			{
					MatrizAdjacenciaCustos[x][x+1]=MapaCusto[i][j];
			}
			//esquerda
			if((x % tamanhoMapa) != 0)
			{
				MatrizAdjacenciaCustos[x][x-1]=MapaCusto[i][j];
			}
			//cima
			if(x-tamanhoMapa>=0 && x-tamanhoMapa<(tamanhoGrafo))
			{
				MatrizAdjacenciaCustos[x][x-tamanhoMapa]=MapaCusto[i][j];
			}
			//baixo
			if((x+tamanhoMapa)>=0 && (x+tamanhoMapa<(tamanhoGrafo)))
			{
				MatrizAdjacenciaCustos[x][(x+tamanhoMapa)]=MapaCusto[i][j];
			}
			}
		}
	return MatrizAdjacenciaCustos;	
}

int** inicializaMatrizInteiros(int linha, int coluna)
{
	int** matriz = (int**) malloc(sizeof(int*)*linha);
    int i,j;
	
	for( i=0;i<coluna;i++)
	{
		matriz[i]=(int*) malloc(sizeof(int)*coluna);
	}
	for( i=0;i<linha;i++)
	{
		for( j=0;j<coluna;j++)
		{
			matriz[i][j]=0;
		}
	}
	
	return matriz;
}
char** inicializaMatrizChar(int linha, int coluna)
{
	char** matriz = (char**) malloc(sizeof(char*)*linha);
    int i,j;
	
	for( i=0;i<linha;i++)
	{
		matriz[i]=(char*) malloc(sizeof(char)*coluna);
	}
	for( i=0;i<linha;i++)
	{
		for( j=0;j<coluna;j++)
		{
			matriz[i][j]='0';
		}
	}
	
	return matriz;
}
void imprimeMatrizInteiros(int linha, int coluna,int** matriz)
{
	int i,j;
	int k=0;
	
	for( i=0;i<linha;i++)
	{
		printf("índice:%d\n",i);
		for( j=0;j<coluna;j++)
		{
			if(matriz[i][j]!=0)
			{
				printf("%d\t",j);
				k++;
			}
		}
		
		//system("pause");
		printf("Total Vertices %d\n",k);
	}
	
}
void imprimeMatrizChar(int linha, int coluna,char** matriz)
{
	int i,j;
	
	for( i=0;i<linha;i++)
	{
		for( j=0;j<coluna;j++)
		{
			printf("%s",matriz[i][j]);
		}
	}
	
}

int **inicializaMatrizAdjacencia(int linhas, int colunas, int val)
{ 
	int i, j;
    int** t = (int**) malloc(sizeof(int*)*linhas);
    for (i = 0; i < linhas; i++)
	{
		t[i] = (int*) malloc(colunas * sizeof(int));
	}
    for (i = 0; i < linhas; i++)
    {
		for (j = 0; j < colunas; j++)
		{
			t[i][j] = val; //inicialmente val é zero, um grafo sem nenhuma aresta;
		}
	}
    return t;
 }
Grafo* inicializaArestasEcustosNoGrafo(int totalVertices, int** MatrizAdjacenciaCusto) //V é o total de vértices
{ 
	Grafo* G = (Grafo*)malloc(sizeof(Grafo));
   	G->V = totalVertices; G->A = 0; //inicialmente a matriz terá as colunas zeradas
    G->matrizAdjacencia = inicializaMatrizAdjacencia(totalVertices, totalVertices, 0); //a totalVertices*totalVertices
    int i,j;
	for(i=0;i<totalVertices;i++)
	{
		for( j=0;j<totalVertices;j++)
		{
			if (MatrizAdjacenciaCusto[i][j] != 0 && i!=j) 
			{
				G->A++;
				G->matrizAdjacencia[i][j] = MatrizAdjacenciaCusto[i][j]; 
				G->matrizAdjacencia[j][i] = MatrizAdjacenciaCusto[j][i]; 
			}
		}
	}

	return G;
 }
int* dijkstra(int start, int tamanhografo,int** MatrizAdjacenciaCusto, int procurado) 
{        
	int i, k, mini;         
    int* visited=(int*) malloc(sizeof(int)*tamanhografo);
	int* distancias=(int*) malloc(sizeof(int)*tamanhografo);
	int* predecessor=(int*) malloc(sizeof(int)*tamanhografo);

	// inicializa todas as distâncias ao infinito, e definir os nós visitamos a nenhum deles.           
    for (i = 0; i < tamanhografo; i++) 
	{ 
		predecessor[i] = 0;
		distancias[i] = 909999; 
		visited[i] = 0;  //todos estão pendentes, nhenhum visitado
    }       
// define a distância para o nó inicial 's' a zero
    distancias[start] = 0; 
// loop exterior - percorrer todos os nós
    for (k = 0; k < tamanhografo; k++)
	{                
		// encontra o nó de custo mínimo
		// se o nó não foi visitado, eo nó de custo mínimo não é inicializado,
		// defina o nó de custo mínimo para o nó atual
		// se a distância para o nó atual é menor do que o mínimo atual,
		// atualizar o mínimo
		 mini = -1;                 
		 for (i = 0; i <tamanhografo; i++) 
		 {
			  if (!visited[i]&&((mini==-1)||(distancias[i]<mini)))                                        
			  {
				  mini = i; 
				  //mini=distancias[i];
			  }
		 }
		// agora temos o nó mínimo atual, configurá-lo para visitar
		visited[mini] = 1; //nó visitado  
		for (i = 0; i < tamanhografo; i++)                               
		{
			if (MatrizAdjacenciaCusto[mini][i]) //atualiza distâncias    //arestas do grafo                               
			{
				if ((distancias[mini] + MatrizAdjacenciaCusto[mini][i] < distancias[i]))                                                        
				{
					distancias[i] = distancias[mini] + MatrizAdjacenciaCusto[mini][i];  
					predecessor[k]= mini;
					if(predecessor[k]==procurado)
						return predecessor;

				}
			}	
		}
    }	
	//return predecessor;//caminho propriamente dito
}
int* dij(int tamanhografo,int start,int** MatrizAdjacenciaCusto)
{
 int i,u,count,w;
 int* predecessor=(int*)malloc(sizeof(int)*tamanhografo);
 int* visitados=(int*)malloc(sizeof(int)*tamanhografo);
 int* distancias=(int*)malloc(sizeof(int)*tamanhografo);
 int min;
 for(i=0;i<tamanhografo;i++)
 {
	 predecessor[i]=0;
	 visitados[i]=0;
	 distancias[i]=999999999;
	 ;
 }
 distancias[start]=0;
 count=0;
while(count<tamanhografo)
{
   min=100;
  for(w=0;w<tamanhografo;w++) //w==pois start começa no zero w=1
  {
	if(distancias[w]<min && !visitados[w])
	{
	   min=distancias[w];
	   u=w;
	}
  }
  distancias[u]=0;
  count++;
  for(w=0;w<tamanhografo;w++)
  {
	   if((distancias[u]+MatrizAdjacenciaCusto[u][w]<distancias[w]) && !visitados[w])
	   {
		   distancias[w]=distancias[u]+MatrizAdjacenciaCusto[u][w];
		   predecessor[u]=w;
	   }
  }
  
 }
return distancias;
}
int* dij2(int totalGrafo,int VerticeOrigemV,int** MatrizAdjacenciaCusto)
{
    int i,u,count,VerticeDestinoW;
	int* predecessor=(int*)malloc(sizeof(int)*totalGrafo);
	int* visitados=(int*)malloc(sizeof(int)*totalGrafo);
	int* distancias=(int*)malloc(sizeof(int)*totalGrafo);
	
	//inicializa vetores
	for(i=0;i<totalGrafo;i++)
	{
		visitados[i]=0;
		predecessor[i]=-1;
		distancias[i]=9999999;
	}
	//////
	int minDistancia = 9999999;
	
	distancias[VerticeOrigemV]=0;
	count=0;
	while(count<totalGrafo)
	{
	    for(VerticeDestinoW=0;VerticeDestinoW<totalGrafo;VerticeDestinoW++)
		 {
		   if(distancias[VerticeDestinoW]<minDistancia && !visitados[VerticeDestinoW])
			{
				minDistancia=distancias[VerticeDestinoW];
				u=VerticeDestinoW;
			}
		 }
		  visitados[u]=1;
		  predecessor[u]=VerticeDestinoW;
		  for(VerticeDestinoW=0;VerticeDestinoW<totalGrafo;VerticeDestinoW++)
		  {
			  if(MatrizAdjacenciaCusto[u][VerticeDestinoW]>0 )
			  {
				  if((distancias[u]+MatrizAdjacenciaCusto[u][VerticeDestinoW]<distancias[VerticeDestinoW]) && !visitados[VerticeDestinoW])
				  {
					distancias[VerticeDestinoW]=distancias[u]+MatrizAdjacenciaCusto[u][VerticeDestinoW];	
					predecessor[u]=VerticeDestinoW;
				  }
				 }
			  
		  }
		  count++;
	}
	return predecessor;
}
int Dijkstra_getVizinhanca(int infinito, int* distancias, int numVertice, int* visitados)
{
    int minDistance = infinito;
    int noVizinhoprox;
    for(int i=0;i<numVertice;i++) 
	{
        if((!visitados[i]) && ( minDistance >= distancias[i])) 
		{
            minDistance = distancias[i];
            noVizinhoprox = i;
        }
    }
    return noVizinhoprox;
}
void Dijkstra_inicializa(int infinito, int start, int totalVertices, int* gCusto, int* predecessor, int* visitados)
{
    for(int i=0;i<totalVertices;i++) 
	{
        visitados[i] = 0;
        predecessor[i] = -1;
        gCusto[i] = infinito;
    }
    gCusto[start]= 0;
}

void Dijkstra_calculateDistance(int infinito, int totalVertices,int** gCusto,int** visitados,int** adjMatrix, int** predecessor)
{
    Dijkstra_inicializa(infinito,0,totalVertices,(*gCusto),(*predecessor),(*visitados));
    int proxNoVizinhoDesmarcado;
    int count = 0;
	//linhas novas//

	//.........//
    while(count < totalVertices) {
        proxNoVizinhoDesmarcado = Dijkstra_getVizinhanca(infinito,(*gCusto),totalVertices,(*visitados));
        *visitados[proxNoVizinhoDesmarcado] = 1;
        for(int i=0;i<totalVertices;i++) {
            if((!(*visitados[i])) && (adjMatrix[proxNoVizinhoDesmarcado][i]>0)) 
			{
                if((*gCusto[i]) > (*gCusto[proxNoVizinhoDesmarcado])+adjMatrix[proxNoVizinhoDesmarcado][i]) 
				{
                    (*gCusto[i]) =(*gCusto[proxNoVizinhoDesmarcado])+adjMatrix[proxNoVizinhoDesmarcado][i];
                    (*predecessor[i]) = proxNoVizinhoDesmarcado;
                }
            }
        }
        count++;
    }
}
void Dijkstra_imprimeCaminho(int node,int start, int** predecessor)
{
    if(node == start)
	{
       printf("%d",node);
	   node=start;
	}
    else 
	if((*predecessor[node]) == -1)
	{
		printf("Não existe caminho para o vértice selecionado");
	}
    else 
	{
        Dijkstra_imprimeCaminho(node+1,start,predecessor);
		printf("%d",node);
    }
}
void Dijkstra_printPath(int node,int start, int* predecessor, int totalVertice)
{
	int endl = totalVertice-1;
    if(node == start)
	{
		printf("%d",node);
	}
    else 
	{
		if(predecessor[node] == -1)
		{
			printf("Não há caminho entre %d e %d",node,endl);
		}
		else 
		{
			Dijkstra_printPath(predecessor[node],start,predecessor,totalVertice);
			printf("Vertice: %d->\n",predecessor[node]);
		}
		
	}
}
void Dijkstra_output(int totalVertice, int start, int* distancias,int* predecessor)
{
	int endl = totalVertice-1;
    for(int i=0;i<totalVertice;i++) 
	{
        if(i == start)
		{
			printf("..%d",start);
		}
		else
		{
			Dijkstra_printPath(i,start,predecessor,totalVertice);
		}
        printf("Distancia total de %d V=%d até W=%d",distancias[i], start ,endl);
		system("pause");
    }
}
int* Dijkstra_main(int start, int totalVertices,int** adjMatrix)
{
	int infinito=99999999;
	int* predecessor=(int*)malloc(sizeof(int)*totalVertices);
	int* visitados=(int*)malloc(sizeof(int)*totalVertices);
	int* distancias=(int*)malloc(sizeof(int)*totalVertices);
	int i;
    int proxNoVizinhoDesmarcado;
    int count = 0;
	
	//Dijkstra_inicializa();
	for(i=0;i<totalVertices;i++) 
	{
        visitados[i] = 0;
		predecessor[i] = -1;
        distancias[i] = infinito;
    }
    distancias[start]= 0;
		
	//Dijkstra_calculateDistance();
	while(count < totalVertices) 
	{
        proxNoVizinhoDesmarcado = Dijkstra_getVizinhanca(infinito,distancias,totalVertices,visitados);
        visitados[proxNoVizinhoDesmarcado] = 1;
        for(int i=0;i<totalVertices;i++) {
            if((!visitados[i]) && (adjMatrix[proxNoVizinhoDesmarcado][i]!=0)) 
			{
                if((distancias[i] > distancias[proxNoVizinhoDesmarcado]+adjMatrix[proxNoVizinhoDesmarcado][i]))
				{
                    distancias[i] =distancias[proxNoVizinhoDesmarcado]+adjMatrix[proxNoVizinhoDesmarcado][i];
                    predecessor[i] = proxNoVizinhoDesmarcado;
                }
            }
        }
        count++;
    }
	//só teste:  Dijkstra_output(totalVertices, start, distancias,predecessor);
	return predecessor;
}


 

 