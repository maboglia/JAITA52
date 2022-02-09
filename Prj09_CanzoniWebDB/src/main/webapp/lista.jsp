<%@page import="model.Canzone"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Canzoni</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">

	<h1>Le nostre hit!</h1>
	
<table  class="table table-dark table-striped">

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

</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>