<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<div class="form-title"><h2>Lisää tallenteen tiedot</h2></div>
	
		<div class="form-title">Tallenteen nimi</div>
		<input class="form-field" type="text" name="name" /><br />
		
		<div class="form-title">Esittäjä</div>
		<input class="form-field" type="text" name="artist" /><br />
		
	<div class="form-field">
      <label for="subject"></label>
      <select placeholder="Subject line" name="subject" >
        <option disabled hidden selected >Tallenteen muoto</option>
        <option>CD</option>
        <option>LP</option>
        <option>C-Kasetti</option>
        <option>MiniDisk</option>
        <option>Savikiekko</option>
        <option>DVD</option>
      </select></div>
		
		<div class="form-title">Valmistusmaa</div>
		<input class="form-field" type="text" name="name" /><br />
		
		<div class="form-title">Tuotantoyhtiö</div>
		<input class="form-field" type="text" name="artist" /><br />
		
		<div class="form-title">Nauhoitusvuosi</div>
		<input class="form-field" type="text" name="name" /><br />

		
		<div class="submit-container"><a href="lisaa-tallenne">
		<input type="submit" name="submit-button" 
		class="submit-button" value="Tallenna"/></a>
		
		<a href="etusivu"><input type="button" name="button" 
		class="button" value="Peruuta" /></a></div>
		
		<div class="submit-container">
		<input class="submit-button" type="submit" value="Submit" />
	</div>
</body>
</html>
body {
	background:#2d2d2d;
  display:flex;
  justify-content: center;
  align-items:center;
  flex-wrap:wrap;
  padding:0;
  margin:0;
  height:100vh;
  width:100vw;
  color:#FFF;
  background-image: url(../images/gramo_vasen.jpg);
    background-repeat: no-repeat;
    background-position: center top;