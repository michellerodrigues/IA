#include <iostream>
#include <iomanip>
#include <queue>
#include <stack>
#include <string>
#include <math.h>
#include <ctime>
#include "AStar.h"
#include "mapa.h"
#include <cstdlib>
#include <cstdio>

using namespace std;
//const int linha=60; // horizontal size of the MapaCusto
//const int coluna=60; // vertical size size of the MapaCusto
const int linha=42;
const int coluna=42;
static int Mapa_Nos_Expandidos[linha][coluna]; // Map of closed (tried-out) nodes
static int Mapa_Nos_EmExpansao[linha][coluna]; // Mapa of open (not-yet-tried) nodes
static int dir_map[linha][coluna]; // Map of directions
const int dir=4; // number of possible directions to go at any position
const int totalVertices=linha*coluna;
//// if dir==4
static int dx[dir]={1, 0, -1, 0};
static int dy[dir]={0, 1, 0, -1};

//static int dy[dir]={0, 1, 1, 1, 0, -1, -1, -1};

class noFila
{
    // current position
    int xPos;
    int yPos;
    // total distance already travelled to reach the noFila
    int custoTerreno;
    // prioridade=custoTerreno+remaining distance estimate
    int prioridade;  // smaller: higher prioridade

    public:
        noFila(int xp, int yp, int d, int p) 
            {xPos=xp; yPos=yp; custoTerreno=d; prioridade=p;}
    
        int getxPos() const{return xPos;}
        int getyPos() const{return yPos;}
        int getCustoTerreno() const{return custoTerreno;}
        int getPrioridade() const{return prioridade;}

        void updatePriority(const int & xDest, const int & yDest)
        {
             //prioridade=custoTerreno+estimate(xDest, yDest)*10; //A*
			 prioridade=custoTerreno+estimate(xDest, yDest); //A*
        }

        //dar melhor Prioridade para ir em linha reta ao invés de diagonal
   //     void nextLevel(const int & i) // i: direction
   //     {
			//if(dir==4)
			//	if(i%2==0)
			//		custoTerreno+=10;
			//	else
			//		custoTerreno+=14;
			//else
			//	custoTerreno+=10;
   //     }
        
        // Estimation function for the remaining distance to the goal.
        const int & estimate(const int & xDest, const int & yDest) const
        {
            static int xd, yd, d;
            xd=xDest-xPos;
            yd=yDest-yPos;         

            // Euclidian Distance
           // d=static_cast<int>(sqrt(xd*xd+yd*yd));

            // Manhattan distance
            d=abs(xd)+abs(yd);
            
            // Chebyshev distance
            //d=max(abs(xd), abs(yd));

            return(d);
        }
};

// Determine prioridade (in the prioridade queue)
bool operator<(const noFila & a, const noFila & b)
{
  return a.getPrioridade() > b.getPrioridade();
}

// A-star algorithm.
// The route returned is a string of direction digits.
//Posicao2D* pathFind( int xStart, int yStart,  int xFinish, int yFinish, int linha , int coluna, int** MapaCusto)
Posicao2D* pathFind(const int & xStart, const int & yStart,  const int & xFinish, const int & yFinish, const int &  linha , const int &  coluna, int** MapaCusto)
{
    static priority_queue<noFila> FilaPrioridade[2]; // list of open (not-yet-tried) nodes
	int indFila; // FilaPrioridade index
	static noFila* n0;
    static noFila* m0;
    static int i, j, x, y, xdx, ydy;
   // static char c;
    indFila=0;
	Posicao2D* Caminho;
	Caminho = (Posicao2D*)malloc(sizeof(Posicao2D)*totalVertices);
    for(i=0;i<totalVertices;i++)
    {
		Caminho[i].x = -1;
		Caminho[i].y = -1;
	}
	printf("primeiro form inicializa Caminho");
	for(x=0;x<linha;x++)
    {
        for(y=0;y<coluna;y++)
        {
            Mapa_Nos_Expandidos[x][y]=0;
            Mapa_Nos_EmExpansao[x][y]=0;
			//dir_map[x][y]=x*coluna+y;
        }
    }
	printf("segundo form inicializa Caminho");
    // create the start noFila and push into list of open nodes
	//int custo = MapaCustoH[xStart][yStart];
	n0=new noFila(xStart, yStart, MapaCusto[xStart][yStart], 0);
    n0->updatePriority(xFinish, yFinish);
    FilaPrioridade[indFila].push(*n0);
    Mapa_Nos_EmExpansao[x][y]=n0->getPrioridade(); // mark it on the open nodes MapaCusto

    // A* search
	
	int totCaminho=0;
    while(!FilaPrioridade[indFila].empty())
    {
        // get the current noFila w/ the highest prioridade
        // from the list of open nodes
        n0=new noFila( FilaPrioridade[indFila].top().getxPos(), FilaPrioridade[indFila].top().getyPos(), 
                     FilaPrioridade[indFila].top().getCustoTerreno(), FilaPrioridade[indFila].top().getPrioridade());

        x=n0->getxPos(); y=n0->getyPos();

        FilaPrioridade[indFila].pop();// remove the noFila from the open list
       	Mapa_Nos_EmExpansao[x][y]=0;

        // mark it on the closed nodes MapaCusto
        Mapa_Nos_Expandidos[x][y]=1;
		
        // quit searching when the goal state is reached
        //if((*n0).estimate(xFinish, yFinish) == 0)
        
		//gravando caminho
		

		if(x==xFinish && y==yFinish) 
        {
            // generate the path from finish to start
            // by following the directions
            string path="";
			string tab="\t";
			
            while(!(x==xStart && y==yStart))
            {
				j=dir_map[x][y];
                //c='0'+(j+dir/2)%dir;
				//c='0'+(j+dir/2);
				//c='0'+j;
                //path=tab+c+path;
                x+=dx[j];
                y+=dy[j];
				printf("x:%d->y:%d\t",x,y);
				Caminho[totCaminho].x = x;
				Caminho[totCaminho].y = y;
				totCaminho++;
				
			}
			// garbage collection
            delete n0;
            // empty the leftover nodes
            while(!FilaPrioridade[indFila].empty()) 
				FilaPrioridade[indFila].pop();           
            //return path;
			//return Caminho;
        }

        // generate moves (child nodes) in all possible directions
        for(i=0;i<dir;i++)
        {
            xdx=x+dx[i]; ydy=y+dy[i];

            if(!(xdx<0 || xdx>linha-1 || ydy<0 || ydy>coluna-1 || Mapa_Nos_Expandidos[xdx][ydy]==1))
			{
                // generate a child noFila
                m0=new noFila( xdx, ydy, n0->getCustoTerreno()+ MapaCusto[xdx][ydy], 
                             n0->getPrioridade());
                //m0->nextLevel(i);
                m0->updatePriority(xFinish, yFinish);

                // if it is not in the open list then add into that
                if(Mapa_Nos_EmExpansao[xdx][ydy]==0)
                {
                    Mapa_Nos_EmExpansao[xdx][ydy]=m0->getPrioridade();
                    FilaPrioridade[indFila].push(*m0);
                    // mark its parent noFila direction
                    dir_map[xdx][ydy]=(i+dir/2)%dir;
                }
                else if(Mapa_Nos_EmExpansao[xdx][ydy]>m0->getPrioridade())
                {
                    // update the prioridade info
                    Mapa_Nos_EmExpansao[xdx][ydy]=m0->getPrioridade();
                    // update the parent direction info
                    dir_map[xdx][ydy]=(i+dir/2)%dir;

                    // replace the noFila
                    // by emptying one FilaPrioridade to the other one
                    // except the noFila to be replaced will be ignored
                    // and the new noFila will be pushed in instead
                    while(!(FilaPrioridade[indFila].top().getxPos()==xdx && 
                           FilaPrioridade[indFila].top().getyPos()==ydy))
                    {                
                        FilaPrioridade[1-indFila].push(FilaPrioridade[indFila].top());
                        FilaPrioridade[indFila].pop();       
                    }
                    FilaPrioridade[indFila].pop(); // remove the wanted noFila
                    
                    // empty the larger size FilaPrioridade to the smaller one
                    if(FilaPrioridade[indFila].size()>FilaPrioridade[1-indFila].size()) indFila=1-indFila;
                    while(!FilaPrioridade[indFila].empty())
                    {                
                        FilaPrioridade[1-indFila].push(FilaPrioridade[indFila].top());
                        FilaPrioridade[indFila].pop();       
                    }
                    indFila=1-indFila;
                    FilaPrioridade[indFila].push(*m0); // add the better noFila instead
                }
                else delete m0; // garbage collection
            }
        }
        //delete n0; // garbage collection
    }
    return Caminho; // no route found
}

void calcularHeuristica_pontosMapa(int** MapaHeuristica,int xStart, int yStart,int xGoal, int yGoal, int tamMapa)
{
	int i=0;int j=0;
  	for(i=0;i<tamMapa;i++)
	{
		for(j=0;j<tamMapa;j++)
		{
			MapaHeuristica[i][j]= abs((xGoal-i)+(yGoal-j));
		}
	}

}