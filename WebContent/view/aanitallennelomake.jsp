<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="author" content="Syntax Terror">

<link href="lomakestyles.css" rel="stylesheet" type="text/css">
<!-- tällä lomakkeella tallennetaan tiedot tietokantaan -->
<title>Lisäys</title>
</head>

<body>

<form class="form-container" method="post">
<div class="form-title"><h2>Lisää tallenteen tiedot</h2></div>
	
			
		<div class="form-title">Tallenteen nimi:</div>
		<div><input class="form-field" type="text" name="name" /></div><br>
			
		<div class="form-title">Esittäjä:</div>
		<div><input class="form-field" type="text" name="artist" /></div><br>
      
		<div class="form-title">Tallenteen muoto:</div>
		<div class="subject">
      	<label for="subject"></label>
	      <select placeholder="Subject line" name="recordtype" id="subject_input" required>
		        <option disabled hidden selected>Valitse pudotusvalikosta</option>
		        <option>CD</option>
		        <option>C-Kasetti</option>
		        <option>DVD</option>
		        <option>Fonografisylinteri</option>
		        <option>Kelanauha</option>
		        <option>LP</option>
		        <option>MiniDisk</option>
		        <option>Savikiekko</option>
		        <option>Muu</option>
		
	      </select></div><br><br>
      
      	<div class="form-title">Valmistusmaa</div>
		<input class="form-field" type="text" name="land" /><br><br>
		
		<div class="form-title">Tuotantoyhtiö</div>
		<input class="form-field" type="text" name="producer" /><br><br>
		
		<div class="form-title">Julkaisusvuosi</div>
		<input class="form-field" type="text" name="year" /><br><br>

		<div class="submit-container"><a href="lisaa-tallenne">
		<input type="submit" name="submit-button" 
		class="submit-button" value="Tallenna"/></a>
		
		<a href="etusivu"><input type="button" name="button" 
		class="button" value="Peruuta" /></a></div>
	</form>

</body>
</html>