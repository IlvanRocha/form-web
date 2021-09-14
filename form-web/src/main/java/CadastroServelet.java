import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/cadastro")
public class CadastroServelet extends HttpServlet{
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>Olá mundo do " +nome+"</body>");
		out.println("</html>");
	}

}
