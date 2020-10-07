package br.com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.model.Usuario;
import br.com.service.Database;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Database.initUser();
		
		HttpSession session = request.getSession();
		
		String emailUser = request.getParameter("emailUser");
		String senha = request.getParameter("senha");
		
		
		int logou = 0;
		for (Usuario usuario : Database.usuarios) {
            if (usuario.getEmail().equals(emailUser) && usuario.getSenha().equals(senha)) {
            	Database.updateContatosUser(emailUser);
            	session.setAttribute("emailUser", emailUser);
            	session.setAttribute("nomeUsuario", usuario.getNome());
   			 	response.sendRedirect("index.jsp");
   			 	logou = 1;
            }
        }
		
		if (logou == 0) {
			session.setAttribute("emailUser",null);
			request.setAttribute("erro", "E-mail ou senha, inválido");
			RequestDispatcher rd = request.getRequestDispatcher("erro.jsp");
			rd.forward(request, response);
		}
	}

}
