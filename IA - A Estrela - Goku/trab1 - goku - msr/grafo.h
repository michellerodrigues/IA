#ifndef GRAFO_H
#define GRAFO_H

typedef struct grafo{
	int V;//total de vértices
	int A;//aresta
	int** matrizAdjacencia;
}Grafo;
typedef struct aresta {
	int v;
	int w;
}Aresta;

//void constroiMatrizAdjacenciaPorCusto(int** MapaCustoColunas, int** MatrizAdjacenciaCustos, int** MapaCusto, int tamanhoMapa);
int** constroiMatrizAdjacenciaPorCusto(int** MapaCustoColunas, int** MapaCusto, int tamanhoMapa, int tamanhoGrafo);
int** inicializaMatrizInteiros(int linha, int coluna);
char** inicializaMatrizChar(int linha, int coluna);
void imprimeMatrizInteiros(int linha, int coluna,int** matriz);
void imprimeMatrizChar(int linha, int coluna,char** matriz);
void inicializaMapaCustoColunas(int linha, int coluna,int*** MapaCustoColunas);


//funções para o grafo

int **inicializaMatrizAdjacencia(int linhas, int colunas, int val);
grafo* inicializaArestasEcustosNoGrafo(int totalVertices, int** MatrizAdjacenciaCusto);//V é o total de vértices
//void dfsR(Grafo* G, Aresta a, int* vet_predecessor,int contador);
int* dijkstra(int start, int tamanhografo,int** MatrizAdjacenciaCusto, int procurado);
int* dij(int tamanhografo,int start,int** MatrizAdjacenciaCusto);
int* dij2(int totalGrafo,int VerticeOrigemV,int** MatrizAdjacenciaCusto);
int* Dijkstra_main(int start, int totalVertices,int** adjMatrix);
//int BuscaEmLargura(Grafo G, Fila *F, int primeiroVertice);
//void Dijkstra_main(int infinito, int start, int totalVertices,int** adjMatrix);
//void Dijkstra_imprimeCaminho(int node,int start, int** predecessor);
//void Dijkstra_calculateDistance(int infinito, int totalVertices,int** distancias,int** visitados,int** adjMatrix, int** predecessor);
int Dijkstra_getVizinhanca(int infinito, int* distancias, int numVertice, int* visitados);
void Dijkstra_inicializa(int infinito, int start, int totalVertices, int* gCusto, int* predecessor, int* visitados);
//void dijkstra(int start);
void Dijkstra_printPath(int node,int start, int* predecessor, int totalVertice);
void Dijkstra_output(int totalVertice, int start, int* distancias,int* predecessor);



#endif /* GRAFO_H */