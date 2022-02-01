<%@ include file="header.jsp" %>


<h1>Aggiungi piatto</h1>

<form action="piatti" method="post">

	<input type="text" name="nomePiatto" placeholder="Scrivi il nome del piatto">
	<input type="text" name="nomeRegione" placeholder="Scrivi il nome della regione">
	<input type="submit" value="Add Piatto">

</form>


<%@ include file="footer.jsp" %>