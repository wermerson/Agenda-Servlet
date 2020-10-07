<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.service.*" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="includes/head.jsp" %>
<title>Lista Contatos</title>
</head>
<body>
	<%@include file="includes/session.jsp" %>
	<%
	String confirmacao = (String) request.getAttribute("confirmacao");
	if (confirmacao != null){
		out.println("<script>alert('"+confirmacao+"');</script>");
	}
	%>
	<h2>Contatos</h2>
	<table border="1" class="table table-stripped">
          <thead>
           <tr>
            <th>Nome</th>
            <th>E-mail</th>
            <th>Telefone</th>
           </tr>
          </thead> 
          <tbody>
           <c:forEach var="contato" items="${Database.contatosUser}">
	           <tr>
		           <td> ${contato.getNome()}</td>
		           <td> ${contato.getEmail()}</td>
		           <td> ${contato.getTelefone()}</td>
	           </tr>
	       </c:forEach>
          </tbody>
    </table>
    
    <!-- h2>Todos Contatos - remover</h2>
	<table border="2" class="table table-stripped">
          <thead>
           <tr>
            <th>emailUser</th>
            <th>Nome</th>
            <th>E-mail</th>
            <th>Telefone</th>
           </tr>
          </thead> 
          <tbody>
           <c:forEach var="contato" items="${Database.contatos}">
	           <tr>
		           <td> ${contato.getEmailUser()}</td>
		           <td> ${contato.getNome()}</td>
		           <td> ${contato.getEmail()}</td>
		           <td> ${contato.getTelefone()}</td>
	           </tr>
	       </c:forEach>
          </tbody>
    </table -->
</body>
</html>