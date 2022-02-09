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


	<input type="text" id="id" placeholder="id" value="500"><br>
	<input type="text" id="titolo" placeholder="titolo"><br>
	<input type="text" id="cantante" placeholder="cantante"><br>
	<input type="text" id="genere" placeholder="genere"><br>
	<input type="text" id="album" placeholder="album"><br>
	<button id="btnAggiungi">Aggiungi</button>

<table id="tabella">

	<tr>
		<th>titolo</th>
		<th>cantante</th>
	</tr>



</table>

<script type="text/javascript">

const URL = "api/canzoni";
const TAB = document.getElementById('tabella');
const BTN = document.getElementById("btnAggiungi");

BTN.onclick = function () {
	
	const canzone = {};

	canzone.id = document.getElementById('id').value;
	canzone.titolo = document.getElementById('titolo').value;
	canzone.cantante = document.getElementById('cantante').value;
	canzone.album = document.getElementById('album').value;
	canzone.genere = document.getElementById('genere').value;

	console.log(canzone);

	

	fetch(URL, {
	method: 'POST', // or 'PUT'
	headers: {
		'Content-Type': 'application/json',
	},
	body: JSON.stringify(canzone),
	})
	.then(response => response.json())
	.then(canzone => {
	console.log('Success:', canzone);
	})
	.catch((error) => {
	console.error('Error:', error);
	});




}
















fetch(URL).then(e => e.json()).then(canzoni => {
	
	let output = "";
	for (let canzone of canzoni){
		
		output += "<tr>" + "<td>" + canzone.titolo +"</td>" + "<td>" + canzone.cantante +"</td>" + "</tr>";
		
	}
	
	TAB.innerHTML += output;
	
});



</script>


</body>
</html>