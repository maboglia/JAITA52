<%@page import="model.Canzone"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Canzoni</title>
</head>
<body>

<h1>Le nostre hit!</h1>

<table>

	<tr>
		<th>titolo</th>
		<th>cantante</th>
	</tr>

<% List<Canzone> canzoni = (List<Canzone>) request.getAttribute("listaCanzoni"); %>

<% for (Canzone c : canzoni){ %>

	<tr>
		<td><a target="_blank" href="https://www.google.com/search?q=<%= c.getTitolo() %>"><%= c.getTitolo() %></a></td>
		<td><a target="_blank" href="https://www.google.com/search?q=<%= c.getCantante() %>"><%= c.getCantante() %></a></td>
	</tr>

<% } %>

</table>


</body>
</html>