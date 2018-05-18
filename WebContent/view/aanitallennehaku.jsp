<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.AaniTallenne"%>
<%@ page import="java.util.ArrayList" %>
<%! @SuppressWarnings("unchecked") %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tallenne haku</title>
</head>
<body>

<form action="hae-tallenne" method="post">
Hakusana:
<input type="text" name="hakusana">&nbsp;
<input type="submit" value="Hae">
</form>
<a href="etusivu"><input type="button" name="button" 
		class="button" value="Palaa etusivulle" /></a>

<table border="1">
<tr>
<td>Tallenteen nimi</td>
<td>Esittäjä</td>
<td>Tallennusmuoto</td>
<td>Valmistusmaa</td>
<td>Tuotantoyhtiö</td>
<td>Nauhoitusvuosi</td>
<tr>
<%
if(request.getAttribute("aaniTallenteet")!=null){
	ArrayList<AaniTallenne> aaniTallenteet = (ArrayList<AaniTallenne>)request.getAttribute("aaniTallenteet");
	for(int i=0; i<aaniTallenteet.size(); i++){
		out.print("<tr>");
		out.print("<td>" + aaniTallenteet.get(i).getName() + "</td>");
		out.print("<td>" + aaniTallenteet.get(i).getArtist() + "</td>");
		out.print("<td>" + aaniTallenteet.get(i).getRecordtype() + "</td>");
		out.print("<td>" + aaniTallenteet.get(i).getLand() + "</td>");
		out.print("<td>" + aaniTallenteet.get(i).getProducer() + "</td>");
		out.print("<td>" + aaniTallenteet.get(i).getYear() + "</td>");
		out.print("</tr>");	
	}
}

%>
</table>
</body>
</html>