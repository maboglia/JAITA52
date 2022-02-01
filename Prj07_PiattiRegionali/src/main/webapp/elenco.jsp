<%@ include file="header.jsp" %>


<%@page import="model.Piatto"%>
<%@page import="java.util.List"%>
<h1>Piatti regionali</h1>


<table>

<tr>
	<th>Nome</th>
	<th>Regione</th>
</tr>

<% List<Piatto> piatti = (List<Piatto>) request.getAttribute("elencoPiatti"); %>

<% for (Piatto p : piatti) { %>
<tr>

	<td><%= p.getNome() %></td>
	<td><%= p.getRegione() %></td>

</tr>
<% } %>

</table>


<%@ include file="footer.jsp" %>