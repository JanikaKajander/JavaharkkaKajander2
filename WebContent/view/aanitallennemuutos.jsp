<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.AaniTallenne"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="styles" type="text/css" href="main.css">
<title>Tietojen muuttaminen</title>
</head>
<%
int id= 0;
if(request.getParameter("muuta_id")!=null){
	id=Integer.parseInt(request.getParameter("muuta_id"));
}
String name="";
if(request.getParameter("name")!=null){
	name=request.getParameter("name");
}
String artist="";
if(request.getParameter("artist")!=null){
	name=request.getParameter("artist");
}
String recordtype ="";
if(request.getParameter("recordtype")!=null){
	name=request.getParameter("recordtype");
}
String land="";
if(request.getParameter("land")!=null){
	name=request.getParameter("land");
}
String producer="";
if(request.getParameter("producer")!=null){
	name=request.getParameter("producer");
}
int year=0;
if(request.getParameter("year")!=null){
	name=request.getParameter("year");
}

%>

<body>
<form action="muuta-tiedot" method="post">
<table>
<tr>
<th align="right">Nimi:</th>
<td><input type="text" name="name" id="name" value="<%=name%>"></td>
</tr>
<tr>
<th align="right">Artisti:</th>
<td><input type="text" name="artist" id="artist" value="<%=artist%>"></td>
</tr>
<tr>
<th align="right">Tallenteen muoto:</th>
<td><input type="text" name="recordtype" id="recordtype" value="<%=recordtype%>"></td>
</tr>
<tr>
<th align="right">Valmistusmaa:</th>
<td><input type="text" name="land" id="land" value="<%=land%>"></td>
</tr>
<tr>
<th align="right">Tuotantoyhtiö:</th>
<td><input type="text" name="producer" id="producer" value="<%=producer%>"></td>
</tr>
<tr>
<th align="right">Julkaisuvuosi:</th>
<td><input type="text" name="year" id="year" value="<%=year%>"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="Vahvista muutos">
<input type="button" value="Kaikki tallenteet" id="kaikki">
</td>
</tr>
</table>
<input type="hidden" name="id" value="<%=id%>">
</form>
<script>
	$(document).ready(function(){
		$("#name").focus();
	    $("#kaikki").click(function(){	    	
	    	window.location.href = 'aanitallennelista.jsp';
	    });
	});

</script>
</body>
</html>