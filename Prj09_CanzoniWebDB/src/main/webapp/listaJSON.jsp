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

<table id="tabella">

	<tr>
		<th>titolo</th>
		<th>cantante</th>
	</tr>



</table>

<script type="text/javascript">

const URL = "api/canzoni";
const TAB = document.getElementById('tabella');

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