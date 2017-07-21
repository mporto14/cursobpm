package curso.ws;

import java.util.List;

import javax.jws.WebService;

import curso.dao.DespesaDAO;
import curso.model.Despesa;

@WebService(endpointInterface="curso.ws.WsDespesa")
public class WsDespesaImpl implements WsDespesa {

	@Override
	public boolean atualizarStatus(Despesa despesa) { 
		List<Despesa> tab = new DespesaDAO().loadAll();
		tab.get(despesa.getId() - 1).setStatus(despesa.getStatus());
		return true;
	}

	@Override
	public Despesa buscarPorId(int id) {
		return new DespesaDAO().byId(id);
	}

}
