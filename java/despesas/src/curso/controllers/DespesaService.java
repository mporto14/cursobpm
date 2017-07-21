package curso.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.bea.albpm.Despesas.Aprovacao.AprovacaoServiceLocator;

import curso.dao.DespesaDAO;
import curso.model.Despesa;

@WebServlet(value = "/despesa")
public class DespesaService extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		new DespesaDAO().loadAll();
		resp.setContentType("text/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write(
				new JSONArray(new DespesaDAO().loadAll()).toString());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = req.getReader();
		String str = null;
		while ((str = br.readLine()) != null) {
			sb.append(str);
		}
		JSONObject jObj;
		try {
			jObj = new JSONObject(sb.toString());
			Despesa desp = new Despesa();
			desp.setMotivo(jObj.getString("motivo"));
			desp.setValor(jObj.getDouble("valor"));
			
			desp.setStatus("Pendente");
			
			int id = new DespesaDAO().cadastrar(desp);

			AprovacaoServiceLocator locator = new AprovacaoServiceLocator();
			locator.setAprovacaoEndpointAddress("http://localhost:9000/albpmServices/Despesas/ws/AprovacaoServiceListener");
			
			String session = locator.getAprovacao()
					.startSession("sys_despesa", "sys_despesa");
			String ret = locator.getAprovacao()
					.iniciarFluxoAprovacao(session, id);
			System.out.println(ret);

			resp.setContentType("text/json");
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter().write("{\"id\": " + id + "}");
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e.getMessage());
		}

	}

}
