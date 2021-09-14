import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String loginV = "ilvan@pop.com";
		String senhaV = "123456";
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		PrintWriter out = res.getWriter();
			out.println("<html>");
			
			if (login.equals(loginV)&& senha.equals(senhaV)) {
			out.println("Acesso aprovado");
			}else {
			out.println("Acesso negado");
}	
			out.println("</html>");
	}

}
