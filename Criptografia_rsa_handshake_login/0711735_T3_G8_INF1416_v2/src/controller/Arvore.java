package controller;

import java.util.BitSet;
import java.util.List;
import java.util.Vector;

// Definição da classe TreeNode e classe Arvore.

// definição da classe TreeNode
class NodeArvore
{
	// membros de acesso de pacote
	NodeArvore nodeEsquerdo; // nó esquerdo
	String valorNode; // valor do nó
	NodeArvore nodeDireito; // nó direito

	// construtor inicializa os dados e os torna um nó-folha
	public NodeArvore( NodeArvore upNode, String valorNode )
	{ 
		this.valorNode = valorNode;              
		nodeEsquerdo = nodeDireito = null; // o nó não tem nenhum filho
	} 
   
	// insere na subárvore esquerda
	public void inserirNaSubArvoreEsquerda( String valorNodeEsquerdo, String valorNodeDireito )
	{
		// insere novo TreeNode
		if ( nodeEsquerdo == null )
			nodeEsquerdo = new NodeArvore( this, valorNodeEsquerdo );
		else // continua percorrendo subárvore esquerda
		{
			nodeEsquerdo.inserirNaSubArvoreEsquerda( valorNodeEsquerdo, valorNodeDireito );
			nodeEsquerdo.inserirNaSubArvoreDireita( valorNodeEsquerdo, valorNodeDireito );
		}
	} // fim do método insertLeft
	
	public void inserirNaSubArvoreDireita( String valorNodeEsquerdo, String valorNodeDireito )
	{	
		// insere novo TreeNode
		if ( nodeDireito == null )
			nodeDireito = new NodeArvore( this, valorNodeDireito );
		else // continua percorrendo subárvore direita
		{
			nodeDireito.inserirNaSubArvoreEsquerda( valorNodeEsquerdo, valorNodeDireito );
			nodeDireito.inserirNaSubArvoreDireita( valorNodeEsquerdo, valorNodeDireito );
		}
	} // fim do método insertRight

}// definição da classe Arvore
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

	// insere um novo nó na árvore binária
	public void inserirNo( String ValueLeft, String ValueRight )
	{
	   root.inserirNaSubArvoreEsquerda( ValueLeft, ValueRight ); // chama o método insertLeft
	   root.inserirNaSubArvoreDireita( ValueLeft, ValueRight ); // chama o método insertRight	   
	   height++;
	} // fim do método insertNodeLeft
   
	// Percorre a árvore colocando as senhas na lista de senhas candidatas
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
		
	public static Arvore CriarArvore (List<String> listaDigitos, int escolhaDigito ) //primeiro ou 4º dígito
	{
		//para o primeiro elemento da árvore, temos a primeira escolha do botão	Raiz	
		Arvore arvore = new Arvore (listaDigitos.get(escolhaDigito));
		//para os demais dígitos, das demais posições, colocamos o esquerdo (1a posição) no no esquerdo e a (4a posição) no do Direito 
		for (int i=1; i<6; i++)
		{
			arvore.inserirNo(listaDigitos.get(2*i),listaDigitos.get(2*i+1));
		}
			
		return arvore;
	}
} // fim da classe Arvore
