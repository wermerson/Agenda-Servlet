<div class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <a href="./index.jsp" class="navbar-brand">JAVAWEB</a>
      <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>
    <div class="navbar-collapse collapse" id="navbar-main">
      <ul class="nav navbar-nav">
        
	        <li>
	          <a href="cadastroContato.jsp">Cadastro de Contato</a>
	        </li>
	        <li>
	          <a href="listaContatos.jsp">Lista de Contatos</a>
	        </li>
	        <li>
	          <a href="cadastroUsuario.jsp">Cadastro de Usuário</a>
	        </li>
	        <li>
	          <a href="listaUsuarios.jsp">Lista de Usuários</a>
	        </li>
		</ul>
      <ul class="nav navbar-nav navbar-right">
	      <li class="dropdown">
	          <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="userActions" aria-expanded="false">${nomeUsuario} <span class="caret"></span></a>
	          <ul class="dropdown-menu" aria-labelledby="userActions">
	              <li><a href="logout.jsp" target="_blank">Sair</a></li>
	          </ul>
	      </li>
      </ul>

    </div>
  </div>
</div>