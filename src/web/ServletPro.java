package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ImplClientDao;
import metier.ClientP;

@WebServlet(name = "SP", urlPatterns = { "*.html" })
public class ServletPro extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ImplClientDao metier;

	@Override
	public void init() throws ServletException {

		metier = new ImplClientDao();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		if (path.equals("/index.html")) {
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		else if (path.equals("/chercher.html")) {

			String motCle = req.getParameter("motCle");
			ClientModel model = new ClientModel();
			model.setMotCle(motCle);
			ArrayList<ClientP> clients = metier.getClientParName("%" + motCle + "%");
			model.setListClients(clients);
			req.setAttribute("model", model);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} 
		else if (path.equals("/ajoutClient.html") && req.getMethod().equals("POST")) {
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			int code = Integer.parseInt(req.getParameter("code"));
			String type = req.getParameter("type");
			ClientP client = metier.save(new ClientP(nom, prenom, code, type));

			req.setAttribute("client", client);
			req.getRequestDispatcher("confirm.jsp").forward(req, resp);

		}
		else if(path.equals("/delete.html")) {
			Long id=Long.parseLong(req.getParameter("id"));
			metier.delete(id);
			//req.getRequestDispatcher("index.jsp").forward(req, resp);
			resp.sendRedirect("chercher.html?motCle=");
		}
		else if(path.equals("/update.html")) {
			Long id=Long.parseLong(req.getParameter("id"));
			ClientP client =metier.getParId(id);
			req.setAttribute("client", client);
			req.getRequestDispatcher("edit.jsp").forward(req, resp);
		}else if (path.equals("/updateClient.html") && req.getMethod().equals("POST")) {
			Long id=Long.parseLong(req.getParameter("id"));
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			int code = Integer.parseInt(req.getParameter("code"));
			String type = req.getParameter("type");
			
			ClientP client = new ClientP(nom, prenom, code, type);
			client.setId(id);
			metier.update(client);

			req.setAttribute("client", client);
			req.getRequestDispatcher("confirm.jsp").forward(req, resp);

		}
		else {
			resp.sendError(resp.SC_NOT_FOUND);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);

	}
}
