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

@WebServlet ("/CadastroServlet")
public class CadastroServelet extends HttpServlet{
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String nomeCompleto = req.getParameter("nomeCompleto");
		String telefone = req.getParameter("fone");
		String dtNascimento = req.getParameter("dtNascimento");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sexo");
		String[] tecnologias = req.getParameterValues("tecnologias");
		String escolaridade = req.getParameter("escolaridade");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println(nomeCompleto);
		out.println(telefone);
		out.println(dtNascimento);
		out.println(email);
		out.println(sexo);
		
		String lsTecnologia = "";
		for (String t : tecnologias) {
			out.println(t);
			lsTecnologia += t+",";
		}
		
		out.println(escolaridade);
		
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://chunee.db.elephantsql.com:5432/bsbsjsgu";
			String usuarioDb = "bsbsjsgu";
			String senhaDb = "NhJC-JvRCAKdFPInvYlYrnbLB3sq9sap";
			Connection con = DriverManager.getConnection(url, usuarioDb, senhaDb);
			out.println("Ok. para a conexão");
			
			String sql = "insert into pessoa (nome_completo , telefone , dt_nascimento , email , sexo , tecnologias , escolaridade)"
				+ "values('"+nomeCompleto+"', '"+telefone+"' , '"+dtNascimento+"' , '"+email+"' , '"+sexo+"', '"+lsTecnologia+"', '"+escolaridade+"')";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.execute();
			pst.close();
			con.close();
			
			out.println("Ok. Registrado");
		} catch (Exception e) {
			out.println("Erro de conexão");
		}
		out.println("</html>");
	}

}
