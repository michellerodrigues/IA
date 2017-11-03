#include <windows.h>
#include <time.h>
#include <math.h>
#include "esferas.h"
#include <stdlib.h>

struct esfera{
	double distMht;//Manhattan dit absoluta 
	int posx;
	int posy;
	int capturada;
};

int calculaDistanciaEsfera(int inix,int iniy, int posx, int posy)
{
	int distMht = abs((inix-posx)+(iniy-posy));
	return distMht;
}

void randomico(int totalMapa, int i, int* posx, int* posy)
{
	srand(time(NULL)*i);//PERGUNTAR AO PROFESSOR SE É NECESSÁRIO
	*posx = rand() % totalMapa;
	*posy = rand() % totalMapa;
}


esfera* sortearEsferasProMapa(int totalEsferas, int totalMapa,int posAgx, int posAgy)
{
	int i;
	esfera* vetEsferas = (esfera*)malloc(sizeof(esfera)*totalEsferas);
	int randY=0;
	int randX=0;
	for(i=0;i<totalEsferas;i++)
	{
		randomico(totalMapa, i,&randX, &randY);
		vetEsferas[i].posx = randX;
		vetEsferas[i].posy = randY;
		vetEsferas[i].distMht = calculaDistanciaEsfera(vetEsferas[i].posx,vetEsferas[i].posy, posAgx, posAgy);
		vetEsferas[i].capturada=0;
	}
	return vetEsferas;
}

//retorna o indice do vetor onde foi encontrada a esfera: retorno >0 e <7 -1 para não encontrada
int temEsfera(int x, int y, esfera* vetorEsferas, int totalEsfera)
{
	for(int i=0;i<totalEsfera;i++)
	{
		if((vetorEsferas[i].posx==x) && (vetorEsferas[i].posy==y))
		{
			if(vetorEsferas[i].capturada==0)
				return i;
			else
				return -1;
		}
	}
	return -1;
}

int analisaPresencaEsferaRadarAtual(int x, int y, int alcanceRadar, int totalEsferas, esfera* vetorEsferas, esfera* vetorEsferasNoRadar, int* indVetEsferaPrincipal)
{
	int indexEsfera = -1;
	int indVetEsfera = 0;
	for(int i=-alcanceRadar;i<=alcanceRadar;i++)
	{
		for(int j=-alcanceRadar;j<=alcanceRadar;j++)
		{
			*indVetEsferaPrincipal = temEsfera(x+i, y+j, vetorEsferas, totalEsferas);
			if(indexEsfera!=-1)
			{
				vetorEsferasNoRadar[indVetEsfera].posx = x+i;
				vetorEsferasNoRadar[indVetEsfera].posy = y+j;
				indVetEsfera++;
			}
		}
	}
	return indVetEsfera+1;
}

esfera* inicializarVetorEsferasRadar(int totalEsferas)
{
	int i;
	esfera* vetEsferas = (esfera*)malloc(sizeof(esfera)*totalEsferas);
	for(i=0;i<totalEsferas;i++)
	{
		vetEsferas[i].posx = -1;
		vetEsferas[i].posy = -1;
		vetEsferas[i].distMht = 0;
		vetEsferas[i].capturada=0;
	}
	return vetEsferas;
}