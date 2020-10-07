
<%
//session.setAttribute("login", "wermerson");
String emailUser = (String)session.getAttribute("emailUser");
String nomeUsuario = (String)session.getAttribute("nomeUsuario");

if (session.getAttribute("emailUser") == null) {
	%>
	<script>location.href='login.jsp';</script>
	<%
}else{
	%>
	<%@include file="menu.jsp" %>
	<%
}
%>
