package curso.dao;

import java.util.ArrayList;
import java.util.List;

import curso.model.Despesa;

public class DespesaDAO {

	private static List<Despesa> tabela = new ArrayList<>();
	
	public int cadastrar(Despesa despesa) { 
		tabela.add(despesa);
		return tabela.size();
	}
	
	public Despesa byId(int id) { 
		return tabela.get(id - 1);
	}
	
	public List<Despesa> loadAll() { 
		return tabela;
	}
	
}
