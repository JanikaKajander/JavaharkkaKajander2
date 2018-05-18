<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<html>
<head>
<style>
th, td {
    padding: 15px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="styles.css" rel="stylesheet" type="text/css">
<title>Kaikki tallenteet</title>

</head>
<body>

	<table>
		<tr>
			<td><div class="form-title"><h2>Hakusi tulokset!</h2></div></td>
			<td align="left"><a href="hae-tallenne2"><input type="button" name="button" 
			class="button" value="Tee uusi haku" /></a></td>
		<td></td>
			<td align="left"><a href="lisaa-tallenne"><input type="button" name="button" 
			class="button" value="Lisää uusi tallenne" /></a></td>
		<td></td>
			<td align="left"><a href="etusivu"><input type="button" name="button" 
			class="button" value="Palaa etusivulle" /></a></td>
		</tr>
	</table>


	<table style="width:90%" class="form-containerlist" border="2" >
	
		<tr>
			<td class="form-title"><b>Tallenteen nimi</b></td>
			<td class="form-title"><b>Esittäjä</b></td>
			<td class="form-title"><b>Tallennusmuoto</b></td>
			<td class="form-title"><b>Valmistusmaa</b></td>
			<td class="form-title"><b>Tuotantoyhtiö</b></td>
			<td class="form-title"><b>Nauhoitusvuosi</b></td>
		</tr>
		
	<c:forEach items="${aaniTallenteet}" var="aaniTallenne">
			<tr>
				<td><c:out value="${aaniTallenne.name}" /></td>
				<td><c:out value="${aaniTallenne.artist}" /></td>
				<td><c:out value="${aaniTallenne.recordtype}" /></td>
				<td><c:out value="${aaniTallenne.land}" /></td>
				<td><c:out value="${aaniTallenne.producer}" /></td>
				<td><c:out value="${aaniTallenne.year}" /></td>
				<td><a href="poista-aaniTallenne?id=<c:out value='${aaniTallenne.id}' />">Poista</a></td>
			</tr>
	</c:forEach>
</table>

</body>
</html>