#include "radar.h"
#include <windows.h>
#include <time.h>
#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include "esferas.h"
#include "mapa.h"
#include "grafo.h"

struct esfera{
	double distMht;//Manhattan dit absoluta 
	int posx;
	int posy;
};
void inicializaMapaConsumo(int** MapaConsumo,int** MapaCusto, int tamanhoMapa)
{
	int i,j;
	for(i=0;i<tamanhoMapa;i++)
	{
		for(j=0;j<tamanhoMapa;j++)
		{
			MapaConsumo[tamanhoMapa][tamanhoMapa]=MapaCusto[tamanhoMapa][tamanhoMapa];
		}
	}
}

/*Funcao para ler o mapa de um arquivo*/
char** LoadMapa(char *filename, int** MapaCusto, int tamanhoMapa)
{
	int c;
	int count_line = 0;
	int count_col = 0;
	FILE *file;
	file = fopen(filename, "r");
	char** Mapa = inicializaMatrizChar(tamanhoMapa,tamanhoMapa);
	if (file)
	{
		//printf("Arquivo Encontrado");
		while ((c = getc(file)) != EOF)
		{
			if (count_col == tamanhoMapa)
			{
				count_line++;
				count_col = 0;
			}
			else
			{
				Mapa[count_line][count_col] = (char)c;
				count_col++;
			}
		}
		fclose(file);
		//printf("Mapa Carregado");
	}
	return Mapa;
}

int** ConfiguraMapaCusto(int tamanhoMapa, char** Mapa)
{
	int** MapaCusto = inicializaMatrizInteiros(tamanhoMapa, tamanhoMapa);
	int i,j;
	for(i=0;i<tamanhoMapa;i++)//coluna
	{
		for(j=0;j<tamanhoMapa;j++)//linha
		{
			if(Mapa[i][j]=='G')
			{
				MapaCusto[i][j] = 1;
			}
			else
			{
				if(Mapa[i][j]=='M')
				{
					MapaCusto[i][j]= 60;
				}
				else
				{
					if(Mapa[i][j]=='A' )
					{
						MapaCusto[i][j] = 10;
					}
				}
			}
		}
	}
	return MapaCusto;
}

int** inicializaMapaCustoColunas(int linha, int coluna,int** MapaCusto)
{
	int tamanhoMapa = linha*coluna;
	int** MapaCustoColunas = inicializaMatrizInteiros(linha, coluna);
	int i,j;
	
	for(i=0;i<linha;i++)
	{
		for( j=0;j<coluna; j++)
		{
			MapaCustoColunas[i][j]= i*linha +j;
		}
	}
	return MapaCustoColunas;
}
//
/*Funcao usada apenas para alterar a cor de fundo do console*/
void SetColorBackground(short color){
	HANDLE hstdout = GetStdHandle(STD_OUTPUT_HANDLE);
	switch (color){
	case 0:
		SetConsoleTextAttribute(hstdout, FOREGROUND_INTENSITY | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_RED);
		break;		
	case 1:
		SetConsoleTextAttribute(hstdout, 44); 
		break;       
	case 2:
		SetConsoleTextAttribute(hstdout, 111);
		break;        
	case 3:
		SetConsoleTextAttribute(hstdout, 159);
		break;        
	case 4: //radar g
		SetConsoleTextAttribute(hstdout, 15);
		break;       
	case 5: //radar m
		SetConsoleTextAttribute(hstdout, 115);
		break;        
	case 6: //radar a
		SetConsoleTextAttribute(hstdout, 90);
		break;  
	case 7: //radar e
		SetConsoleTextAttribute(hstdout, 320);
		break; 
	case 8: //E sem radar
		SetConsoleTextAttribute(hstdout, 180);
		break;  
	default:
		return;
	}
}

/*Funcao para desenhar o mapa*/
void DesenhaMap(int xPos, int yPos, int tamanhoMapa, char** Mapa, esfera* vetorEsferas, int totalEsfera)
{
	int x;
	int y;
	for (x = 0; x < tamanhoMapa; x++)
	{
		for (y = 0; y < tamanhoMapa; y++)
		{	
			if (Mapa[x][y] == 'G') //Escolhe a cor do fundo com base no tipo do terreno troquei Mapa[x][y] de [y][x]	
			{
				SetColorBackground(1);				
				if(estahNoRadar(x,y,xPos,yPos))
				{
					SetColorBackground(4);
					if(temEsfera(x,y,vetorEsferas,totalEsfera)!=-1)
					{
						SetColorBackground(7);
					}
				}
				if(temEsfera(x,y,vetorEsferas,totalEsfera)!=-1)
				{
					SetColorBackground(8);
				}

			}
			else if (Mapa[x][y] == 'M')	
			{
				SetColorBackground(2);				
				if(estahNoRadar(x,y,xPos,yPos))
				{
					SetColorBackground(5);
					if(temEsfera(x,y,vetorEsferas,totalEsfera)!=-1)
					{
						SetColorBackground(7);
					}
				}
				if(temEsfera(x,y,vetorEsferas,totalEsfera)!=-1)
				{
					SetColorBackground(8);
				}
			}
			else if (Mapa[x][y] == 'A')	
			{
				SetColorBackground(3);			
				if(estahNoRadar(x,y,xPos,yPos))
				{
					SetColorBackground(6);
					if(temEsfera(x,y,vetorEsferas,totalEsfera)!=-1)
					{
							SetColorBackground(7);
					}
				}
				if(temEsfera(x,y,vetorEsferas,totalEsfera)!=-1)
				{
					SetColorBackground(8);
				}
			}
			else 
				SetColorBackground(0);

			if ((x == xPos)&&(y == yPos))
				printf("%c", 1);
			else
				printf(" ");
		}
		SetColorBackground(0);
		printf("\n");

	}
	printf("\n");
	SetColorBackground(0);
}
