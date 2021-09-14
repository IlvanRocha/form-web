<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="CSS/estilo.css">
</head>
<style>
    .block-inline *{
        display: inline;

    }
</style>
<body>
    <form action="api cadastro.jsp">
        <fieldset>
            <legend>Acessar</legend>
            <img id="img-java" src="img/java lang.png" alt="imagem java">
            <label for="nome">Nome Completo</label>
            <input type="text" class="alturatexto" id="nome" placeholder="digite seu nome completo" name="nome-completo">

            <label for="telefone">Telefone</label>
            <input type="number" class="alturatexto" id="telefone" name="fone" placeholder="(61)9.9999-9999"> 

            <label for="nascimento">Data de nascimento</label>
            <input type="date" class="alturatexto" id="nascimetno" name="dt-nasc" placeholder="digite sua data de nascimento"> 

            <label for="email">email</label>
            <input type="email" class="alturatexto" id="email" name="email" placeholder="digite seu email">
            <label for="sexo">sexo</label> 
            <div class="block-inline">
                <input type="radio"  id="masc" name="sexo" value="m">  <label for="masc">Masculino
                <input type="radio"  id="fem" name="sexo" value="f"> <label for="fem">Feminino
            </div>    
            <label for="">Conhecimentos</label> 
            <div class="block-inline">
                <label for="HTML">HTML <input type="checkbox"  id="HTML" name="Conhecimentos" value="HTML">
                <label for="CSS">CSS<input type="checkbox"  id="CSS" name="Conhecimentos" value="CSS">
                <label for="Java">Java <input type="checkbox"  id="HTML" name="Conhecimentos" value="Java">
                <label for="PHP">PHP<input type="checkbox"  id="CSS" name="Conhecimentos" value="PHP">
                
            </div> 
            <label for="">Escolaridade</label> 
                <select name="escolaridade" id="escolaridade">
                    <option value=""></option>
                    <option value="fundamental">Fundamental</option>
                    <option value="ensino médio">ensino médio</option>
                    <option value="superior">superior</option>
                </select>
                <input type="submit" class="bt" value="Enviar">
                <input type="reset" class="bt" value="Limpar">
        </fieldset>
    </form>
</body>
</html>