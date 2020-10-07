<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="includes/head.jsp" %>
<title>Cadastro de Contato</title>
</head>
<body>
	<%@include file="includes/session.jsp" %>
	<fieldset>
	<form action="CadastroContatoServlet" method="POST">
			<div class="col-md-12">
				<div class="form-group">
					<label>Nome</label>
					<input type="text" class="form-control" name="nome" id="nome"/>
				</div>
				
				<div class="form-group">
					<label>E-mail</label>
					<input type="email" class="form-control" name="email" id="email"/>
				</div>
				
				<div class="form-group">
					<label>Telefone</label>
					<input type="text" class="form-control" name="telefone" id="telefone"/>
				</div>
				
				<div class="form-group">
					<input type="submit" class="btn btn-success" value="Cadastrar">
				</div>
			</div>

		</form>
	</fieldset>
</body>
</html>