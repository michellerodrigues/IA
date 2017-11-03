#ifndef MAPA_H
#define MAPA_H

struct esfera;
typedef struct pos2D{ //Estrutura para armazenar a posicao 2D do agente e destino
	int x;
	int y;
}Posicao2D;

/*Funcao para ler o mapa de um arquivo*/;
char** LoadMapa(char *filename, int** MapaCusto, int tamanhoMapa);
int** inicializaMapaCustoColunas(int linha, int coluna,int** MapaCusto);
/*Funcao usada apenas para alterar a cor de fundo do console*/
void SetColorBackground(short color);
void inicializaMapaConsumo(int** MapaConsumo,int** MapaCusto, int tamanhoMapa);
/*Funcao para desenhar o mapa*/
void DesenhaMap(int xPos, int yPos, int tamanhoMapa, char** Mapa, esfera* vetorEsferas, int totalEsfera);
int** ConfiguraMapaCusto(int tamanhoMapa, char** Mapa);
#endif /*MAPA_H*/