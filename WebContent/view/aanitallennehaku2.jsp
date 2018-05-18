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
<title>Tallenne haku</title>

</head>
<body>

<form action="hae-tallenne2" class="form-container" method="post">
<div class="form-title"><h2>Hakusana:</h2></div>

<input class="form-field" type="text" name="hakusana">&nbsp;
<input type="submit" class="button" value="Hae tallenteista">
<a href="etusivu"><input type="button" name="button" 
class="button" value="Palaa etusivulle" /></a>
</form>
</body>
</html>