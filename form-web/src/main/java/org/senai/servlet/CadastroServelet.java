package org.senai.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.senai.db.Conexao;
import org.senai.dow.PessoaDow;
import org.senai.mogel.Pessoa;

@WebServlet ("/CadastroServlet")
public class CadastroServelet extends HttpServlet{
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		Pessoa objP = new Pessoa();
		
		
		objP.setNomeCompleto(req.getParameter("NomeCompleto"));
		objP.setTelefone(req.getParameter("fone"));
		objP.setDtNascimento(req.getParameter("DtNascimento"));
		objP.setEmail(req.getParameter("email"));
		objP.setSexo(req.getParameter("sexo"));
		objP.setTecnologias(req.getParameterValues("tecnologias"));
		objP.setEscolaridade(req.getParameter("escolaridade"));
		
		PessoaDow objDow = new PessoaDow();
		
		if(objDow.adicionar(objP)) {
			res.sendRedirect("listaPessoa.jsp");
		} else {
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("Erro ao grava");
			out.println("</html>");
		}
		
	
		
		
	}

}
