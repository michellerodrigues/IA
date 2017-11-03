
#ifndef RADAR_H
#define RADAR_H
#include "mapa.h"

int estahNoRadar(int x, int y, int Agentex, int Agentey);
void ConfiguraRadarProAgente(int coluna, int linha, int totalRadar, int** CustoRadar, char** Mapa);
void ConfiguraCustoRadarMapa(int Agentex, int Agentey, int alcanceRadar,int totalRadar, int** CustoRadar,char** Mapa);
Posicao2D* pontosExploracaoMapa(int totalVerticesMapa, int totalVerticesRadar, int totMapa, int totalRadar);
#endif /* RADAR_H */