package genericservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenericServletImplementation extends GenericServlet{
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("text/html");
		PrintWriter pr=arg1.getWriter();
		pr.println("<html>");
		pr.println("<body>");
		pr.println("<h1>This is my servlet data</h1>");
		pr.println("</body>");
		pr.println("</html>");
	}

}
