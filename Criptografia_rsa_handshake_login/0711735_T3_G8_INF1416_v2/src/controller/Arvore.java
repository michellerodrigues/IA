package controller;

import java.util.BitSet;
import java.util.List;
import java.util.Vector;

// Defini��o da classe TreeNode e classe Arvore.

// defini��o da classe TreeNode
class NodeArvore
{
	// membros de acesso de pacote
	NodeArvore nodeEsquerdo; // n� esquerdo
	String valorNode; // valor do n�
	NodeArvore nodeDireito; // n� direito

	// construtor inicializa os dados e os torna um n�-folha
	public NodeArvore( NodeArvore upNode, String valorNode )
	{ 
		this.valorNode = valorNode;              
		nodeEsquerdo = nodeDireito = null; // o n� n�o tem nenhum filho
	} 
   
	// insere na sub�rvore esquerda
	public void inserirNaSubArvoreEsquerda( String valorNodeEsquerdo, String valorNodeDireito )
	{
		// insere novo TreeNode
		if ( nodeEsquerdo == null )
			nodeEsquerdo = new NodeArvore( this, valorNodeEsquerdo );
		else // continua percorrendo sub�rvore esquerda
		{
			nodeEsquerdo.inserirNaSubArvoreEsquerda( valorNodeEsquerdo, valorNodeDireito );
			nodeEsquerdo.inserirNaSubArvoreDireita( valorNodeEsquerdo, valorNodeDireito );
		}
	} // fim do m�todo insertLeft
	
	public void inserirNaSubArvoreDireita( String valorNodeEsquerdo, String valorNodeDireito )
	{	
		// insere novo TreeNode
		if ( nodeDireito == null )
			nodeDireito = new NodeArvore( this, valorNodeDireito );
		else // continua percorrendo sub�rvore direita
		{
			nodeDireito.inserirNaSubArvoreEsquerda( valorNodeEsquerdo, valorNodeDireito );
			nodeDireito.inserirNaSubArvoreDireita( valorNodeEsquerdo, valorNodeDireito );
		}
	} // fim do m�todo insertRight

}// defini��o da classe Arvore
public class Arvore
{
	public NodeArvore root;
	public int height = 0;
	public Vector<String> vetSenha = new Vector<String>();
	String temp = "";
	
	public NodeArvore getRoot() {
		return root;
	}

	public void setRoot(NodeArvore root) {
		this.root = root;
	}

	public Arvore( String nodeData ) 
	{ 
      root = new NodeArvore( null, nodeData );
      height++;
	} // fim construtor sem argumento Arvore

	// insere um novo n� na �rvore bin�ria
	public void inserirNo( String ValueLeft, String ValueRight )
	{
	   root.inserirNaSubArvoreEsquerda( ValueLeft, ValueRight ); // chama o m�todo insertLeft
	   root.inserirNaSubArvoreDireita( ValueLeft, ValueRight ); // chama o m�todo insertRight	   
	   height++;
	} // fim do m�todo insertNodeLeft
   
	// Percorre a �rvore colocando as senhas na lista de senhas candidatas
	public void armazenarSenhasGeradas( NodeArvore nodeAtual, List<String> vetorSenhasCandidatas)
	{
		int folhas = (int)Math.pow((double)2,(double)height-1);
		BitSet bs = new BitSet(height-1);
		String passwd = "";
		for(int tam=0; tam<folhas; tam++)
		{
			bs = IntToBitSet(tam, height);
			NodeArvore node = nodeAtual;
			
			for (int niveis=height-2; niveis>=0; niveis--)
			{
				passwd+=node.valorNode;
				if( bs.get(niveis) == false)
					node = node.nodeEsquerdo;
				else
					node = node.nodeDireito;
			}

			passwd+=node.valorNode;
			vetorSenhasCandidatas.add(passwd);
			passwd = "";
		}

	}
	
	// Converte de inteiro para BitSet
	public BitSet IntToBitSet ( int i, int tamSenha )
	{
		BitSet bs = new BitSet(tamSenha);
		String str = Integer.toBinaryString(i);
		
		for(int c = str.length()-1; c>=0; c--)
		{
			if( str.charAt(c) == '1')
			{
				bs.set(str.length()-c-1, true);
			}
		}
		return bs;
	}
		
	public static Arvore CriarArvore (List<String> listaDigitos, int escolhaDigito ) //primeiro ou 4� d�gito
	{
		//para o primeiro elemento da �rvore, temos a primeira escolha do bot�o	Raiz	
		Arvore arvore = new Arvore (listaDigitos.get(escolhaDigito));
		//para os demais d�gitos, das demais posi��es, colocamos o esquerdo (1a posi��o) no no esquerdo e a (4a posi��o) no do Direito 
		for (int i=1; i<6; i++)
		{
			arvore.inserirNo(listaDigitos.get(2*i),listaDigitos.get(2*i+1));
		}
			
		return arvore;
	}
} // fim da classe Arvore
