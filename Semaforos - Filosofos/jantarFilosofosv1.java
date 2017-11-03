package t1PDC;

import java.util.Random;

public class jantarFilosofosv1 {

	public int numFilosofos;
	int[] estados;
	public static final int pensando = 0;
	public static final int  comFome = 1;
	public static final int  comendo = 2;
	
	int[] semaforos;
	int mutex; //exclus�o mutua
	
	//construtor

	public jantarFilosofosv1(int totalFilosofos ) {
		this.numFilosofos=totalFilosofos;
		semaforos=new int[totalFilosofos];
		estados=new int[3];
		estados[0]=pensando;
		estados[1]=comFome;
		estados[2]=comendo;
		mutex=1;
		
		for(int i=0;i<numFilosofos;i++)
		{
			semaforos[i]=0;
		}
		
		
	}

		
	void pegarGarfo1(int filosofo)
	{
		downMutex();
		estados[filosofo]=comFome;
		testar(filosofo);
		upMutex();
		downSemaforo(filosofo);		
	}
	
	void comer(int filosofo)
	{
		downMutex();
		estados[filosofo]=comendo;
		System.out.println("Fil�sofo " + filosofo + ":est� comendo");
		testar(filosofo);
		upMutex();
		downSemaforo(filosofo);		
	}
	
	void devolverGarfo(int filosofo)
	{
		int FilosofoEsquerdo = (filosofo-1)%this.numFilosofos;
		int FilosofoDireito = (filosofo+1) % this.numFilosofos;		
		downMutex();
		estados[filosofo]=pensando;
		System.out.println("Fil�sofo " + filosofo + ": est� pensando");
		testar(FilosofoEsquerdo);
		testar(FilosofoDireito);
		upMutex();
	}
	
	void testar(int filosofo)
	{
		int FilosofoEsquerdo = (filosofo-1)%this.numFilosofos;
		int FilosofoDireito = (filosofo+1)%this.numFilosofos;
		if (FilosofoEsquerdo<0)
			FilosofoEsquerdo=0;
		if (FilosofoDireito<0)
			FilosofoDireito=0;
		System.out.println("entrou no teste");
		System.out.println("FilosofoEsquerdo " + FilosofoEsquerdo + "est� "+ this.estados[FilosofoEsquerdo]);
		System.out.println("FilosofoDireito " + FilosofoDireito + "est� "+ this.estados[FilosofoDireito]);
		if(this.estados[filosofo]==comFome && 
								this.estados[FilosofoEsquerdo]!=comendo && 
										this.estados[FilosofoDireito]!=comendo)
		{
			this.estados[filosofo]=comendo;
			System.out.println("Fil�sofo " + filosofo + ": est� comendo");
			upSemaforo(filosofo);
		}
			
		   
	}
	
	void upMutex()
	{
		this.mutex++;
	}
	
	void downMutex()
	{
		//falta verificar valor para dar ou n�o o down
		this.mutex--;
	}
	
	void downSemaforo(int NumSemaforo)
	{
		//falta verificar valor para dar ou n�o o down
		this.semaforos[NumSemaforo]=this.semaforos[NumSemaforo]--;
		System.out.println("Fil�sofo " + NumSemaforo + "saiu da regi�o cr�tica");
	}
	
	void upSemaforo(int NumSemaforo)
	{
		//falta verificar valor para dar ou n�o o up
		
		this.semaforos[NumSemaforo]=this.semaforos[NumSemaforo]++;
		System.out.println("Fil�sofo " + NumSemaforo + "entrou na regi�o cr�tica");
		
	}
	
	public static void main(String[] args)
	{
		int totalFilosofos=4;
		jantarFilosofosv1 jantar=new jantarFilosofosv1(totalFilosofos);
		
		Random rn = new Random();
		int numFilosofo=rn.nextInt(totalFilosofos);

		System.out.println(numFilosofo);
		jantar.semaforos[numFilosofo]=pensando;
		while(true)
		{
			jantar.comer(numFilosofo);
			jantar.devolverGarfo(numFilosofo);
		}
	}
}

