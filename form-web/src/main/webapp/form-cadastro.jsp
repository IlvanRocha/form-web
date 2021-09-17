<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Cadastro</title>
 <link rel="stylesheet" href="CSS/estilo.css">
</head>
<style>
    .block-inline *{
        display: inline;

    }
</style>
<body>
    <form action="CadastroServlet">
        <fieldset>
            <legend>Acessar</legend>
            <img id="img-java" src="img/java lang.png" alt="imagem java">
            <label for="nome">Nome Completo</label>
            <input type="text" class="alturatexto" id="NomeCompleto" placeholder="digite seu nome completo" name="NomeCompleto">

            <label for="telefone">Telefone</label>
            <input type="number" class="alturatexto" id="telefone" name="fone" placeholder="(61)9.9999-9999"> 

            <label for="nascimento">Data de nascimento</label>
            <input type="date" class="alturatexto" id="DtNascimetno" name="DtNascimento" placeholder="digite sua data de nascimento"> 

            <label for="email">email</label>
            <input type="email" class="alturatexto" id="email" name="email" placeholder="digite seu email">
            <label for="sexo">Sexo</label> 
            <div class="block-inline">
                <input type="radio"  id="masc" name="sexo" value="m">  <label for="masc">Masculino
                <input type="radio"  id="fem" name="sexo" value="f"> <label for="fem">Feminino
            </div>    
            <label for="">Tecnologias</label> 
            <div class="block-inline">
                 <input type="checkbox"  id="HTML" name="tecnologias" value="HTML"><label for="HTML">HTML</label>
               <input type="checkbox"  id="CSS" name="tecnologias" value="CSS"> <label for="CSS">CSS</label>
               <input type="checkbox"  id="HTML" name="tecnologias" value="Java"> <label for="Java">Java </label>
                <input type="checkbox"  id="CSS" name="tecnologias" value="PHP"><label for="PHP">PHP</label>
                
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