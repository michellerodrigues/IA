#include <iostream>
#include <iomanip>
#include <queue>
#include <stack>
#include <string>
#include <math.h>
#include <ctime>
#include "mapa.h"
using namespace std;
typedef struct _vetPos2D vetPos2D;

class noFila;
typedef struct pos2D Posicao2D;
// Determine priority (in the priority queue)
bool operator<(const noFila & a, const noFila & b);

// A-star algorithm.
// The route returned is a string of direction digits.
//string pathFind( const int & xStart, const int & yStart,  const int & xFinish, const int & yFinish, const int & linha , const int & coluna, int** MapaCusto, int** dir_map);
//Posicao2D* pathFind(const int & xStart, const int & yStart,  const int & xFinish, const int & yFinish, int linha , int coluna, int** MapaCusto);
Posicao2D* pathFind(const int & xStart, const int & yStart,  const int & xFinish, const int & yFinish, const int &  linha , const int &  coluna, int** MapaCusto);
//Posicao2D* pathFind( int xStart, int yStart,  int xFinish, int yFinish, int linha , int coluna, int** MapaCusto);

void calcularHeuristica_pontosMapa(int** MapaCustoH,int xStart, int yStart,int xGoal, int yGoal, int tamMapa);