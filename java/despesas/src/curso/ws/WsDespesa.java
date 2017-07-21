package curso.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import curso.model.Despesa;

@WebService
@SOAPBinding(style=Style.RPC)
public interface WsDespesa {

	@WebMethod
	public boolean atualizarStatus(Despesa despesa);
	
	public Despesa buscarPorId(int id);
	
}
