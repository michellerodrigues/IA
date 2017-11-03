#include "mapa.h"
#include "radar.h"
#include <math.h>
#include <stdlib.h>

struct esfera{
	double distMht;//Manhattan dit absoluta 
	int posx;
	int posy;
	int capturada;
};
int estahNoRadar(int x, int y, int Agentex,int Agentey)
{
	if((x - Agentex>=-3 && x-Agentex<=3) && 
		(y - Agentey>=-3 && y-Agentey<=3))
		return 1;
	else
		return 0;
}

void ConfiguraRadarProAgente(int coluna, int linha, int totalRadar, int** CustoRadar, char** Mapa)
{
	if(Mapa[coluna][linha]== 'G')
	{
		CustoRadar[coluna%totalRadar][linha%totalRadar] = 1;
	}
	else 
	{
		if(Mapa[coluna][linha]== 'M')
		{
			CustoRadar[coluna%totalRadar][linha%totalRadar] = 60;
		}
		else
		{
			if(Mapa[coluna][linha]== 'A')
			{
				CustoRadar[coluna%totalRadar][linha%totalRadar] = 10;
			}
			
		}
	}
}
void ConfiguraCustoRadarMapa(int Agentex, int Agentey, int alcanceRadar,int totalRadar, int** CustoRadar,char** Mapa)
{
	int i,j;
	for(i=-3;i<=alcanceRadar;i++)
	{
		for(j=-3;j<=alcanceRadar;j++)
		{
			ConfiguraRadarProAgente(Agentey+i,Agentex+j,totalRadar,CustoRadar,Mapa);
		}
	}	
}

Posicao2D* pontosExploracaoMapa(int totalVerticesMapa, int totalVerticesRadar, int totMapa, int totalRadar)
{
	float totPontos = 0.0;
	
	totPontos = totalVerticesMapa/totalVerticesRadar;
	
	//teto
	int totalPontosInt = (int)ceil(totPontos);
	Posicao2D* vetPontosExplorar = (Posicao2D*) malloc(sizeof(Posicao2D)*totalPontosInt);
	

	for(int j=0;j<totalPontosInt;j++) //s
	{
		for(int x=4;x<totMapa;x+=totalRadar*j+totalRadar)
		{			
			for(int y=4;y<totMapa;y+=totalRadar*j+totalRadar)
			{
				vetPontosExplorar[j].x = x;
				vetPontosExplorar[j].y = y;
			}
		}
	}
	return vetPontosExplorar;
}