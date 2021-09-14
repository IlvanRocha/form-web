<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="CSS/estilo.css">
</head>
<body>
    <fieldset>
    	<form action="LoginServlet" method="post">
	    <legend>Acessar</legend>
		     <img id="img-java" src="img/java lang.png" alt="imagem java">
		        <label for="login">Login</label>
		        <input type="text" class="alturatexto" name="login" autocomplete="off" placeholder="nome">
		        <label for="Senha">Senha</label>
		        <input type="text" class="alturatexto" name = "senha" id="Senha" placeholder="digite sua senha">
		        <input type="submit" class="bt" value="Entrar">
	     </form>
    </fieldset>
</body>
</html>