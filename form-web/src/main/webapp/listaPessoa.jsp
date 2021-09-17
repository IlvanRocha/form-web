
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="org.senai.mogel.Pessoa"%>
<%@page import="java.util.List"%>
<%@page import="org.senai.dow.PessoaDow"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.senai.db.Conexao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Pessoas</title>
</head>

<body>
<%

PessoaDow objDow = new PessoaDow();
List<Pessoa> ls = objDow.listaPessoa();

if(ls.size() > 0){
	
%>

	<table>
			<tr>
				<th>Nome</th>
				<th>Email</th>
			</tr>
		<%
	for(Pessoa p : ls) {
		{%>
			<tr>
				<td> <%=p.getNomeCompleto()%> </td>
				<td> <%=p.getEmail()%> </td>
			
			</tr>
		
		<% } %>
		
	</table>
	
 <% } 
}
 %>

</body>
</html>