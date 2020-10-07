package br.com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.model.Contato;
import br.com.service.Database;

/**
 * Servlet implementation class CadastroContatoServlet
 */
@WebServlet("/CadastroContatoServlet")
public class CadastroContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Contato contato;
	
	public CadastroContatoServlet() {
		this.contato = new Contato();
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String emailUser = (String) session.getAttribute("emailUser");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		
		this.contato.setEmailUser(emailUser);
		this.contato.setNome(nome);
		this.contato.setEmail(email);
		this.contato.setTelefone(telefone);
		
		if (this.cadastrar(this.contato)) {
			Database.updateContatosUser(emailUser);
			request.setAttribute("confirmacao", "Contato cadastrado com sucesso!");
		} else {
			request.setAttribute("confirmacao", "Não foi possível cadastrar o contato.");
		}
		
		this.contato = new Contato();
		
		RequestDispatcher rd = request.getRequestDispatcher("listaContatos.jsp");
		rd.forward(request, response);
	}
	
	public boolean cadastrar(Contato contato) {
		if (contato.getEmail() != "" && contato.getEmail() != null && contato.getTelefone() != "" && contato.getTelefone() != null) {
			for (Contato contatoCadastrado : Database.contatosUser) {
	            if (contatoCadastrado.getEmail().equals(contato.getEmail()) || contatoCadastrado.getTelefone().equals(contato.getTelefone())) {
	            	return false;
	            }
	        }
			Database.contatos.add(contato);
			return true;
		}
		return false;
	}

}
