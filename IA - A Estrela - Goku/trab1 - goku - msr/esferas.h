#ifndef ESFERAS_H
#define ESFERAS_H

struct esfera;

int calculaDistanciaEsfera(int inix,int iniy, int posx, int posy);
esfera* sortearEsferasProMapa(int totalEsferas, int totalMapa,int posAgx, int posAgy);
int temEsfera(int x, int y, esfera* vetorEsferas, int totalEsfera);
void randomico(int totalMapa, int i, int posx, int posy);
int analisaPresencaEsferaRadarAtual(int x, int y, int alcanceRadar, int totalEsferas, esfera* vetorEsferas, esfera* vetorEsferasNoRadar, int* indVetEsferaPrincipal);
esfera* inicializarVetorEsferasRadar(int totalEsferas);
#endif /* ESFERAS_H */

