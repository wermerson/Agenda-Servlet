package br.com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.Usuario;
import br.com.service.Database;

/**
 * Servlet implementation class CadastroUsuarioServlet
 */
@WebServlet("/CadastroUsuarioServlet")
public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Usuario usuario = new Usuario();
		usuario.setNome((String)request.getParameter("nome"));
		usuario.setEmail((String)request.getParameter("email"));
		usuario.setTelefone((String)request.getParameter("telefone"));
		usuario.setEndereco((String)request.getParameter("endereco"));
		usuario.setSenha((String)request.getParameter("senha"));
		
		if (this.cadastrar(usuario)) {
			request.setAttribute("confirmacao", "Usuário cadastrado com sucesso!");
		} else {
			request.setAttribute("confirmacao", "Não foi possível cadastrar o usuário.");
		}
		RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
		rd.forward(request, response);
		//RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
		//rd.forward(request, response);
		//response.sendRedirect("listaUsuarios.jsp");
	}
	
	public boolean cadastrar(Usuario usuario) {
		if (usuario.getEmail() != "" && usuario.getEmail() != null) {
			Database.usuarios.add(usuario);
			return true;
		} else {
			//System.out.println(usuario.getEmail());
		}
		return false;
	}

}
