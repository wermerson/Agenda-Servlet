<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="includes/head.jsp" %>
<title>Bem-vindo!</title>
</head>
<body>
	<%@include file="includes/session.jsp" %>
	<div>
		<p>Seja bem vindo Sr ${nomeUsuario}</p>
	</div>
</body>
</html>