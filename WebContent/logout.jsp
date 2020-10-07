
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<%@include file="includes/head.jsp" %>
<title>Logout</title>
</head>
<body>
	<%@include file="includes/session.jsp" %>
	<script>alert("Ei ${nomeUsuario}, você saiu do sistema.");</script>
	<script>location.href='login.jsp';</script>
</body>
</html>