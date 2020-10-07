<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="includes/head.jsp" %>
	<title>Login</title>
</head>
<body>
	<div class="col-md-12">
		<form action="Login" method="POST">
			<div class="form-group">
				<label>E-mail</label>
				<input type="email" class="form-control" name="emailUser" id="emailUser"/>
			</div>
			<div class="form-group">
				<label>Senha</label>
				<input type="password" class="form-control" name="senha" id="senha"/>
			</div>
			<input type="submit" value="Enviar">
		</form>
	</div>
</body>
</html>