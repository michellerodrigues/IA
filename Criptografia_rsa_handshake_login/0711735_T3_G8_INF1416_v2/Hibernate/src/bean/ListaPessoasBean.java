package bean;

import java.util.ArrayList;
import java.util.List;

import modelo.Pessoa;


public class ListaPessoasBean {
	List<Pessoa> listaPessoas =  new ArrayList<Pessoa>();

	public List<Pessoa> getListaPessoas() {
		return listaPessoas;
	}

	public void setListaPessoas(List<Pessoa> listaPessoas) {
		this.listaPessoas = listaPessoas;
	}
	
	


}

