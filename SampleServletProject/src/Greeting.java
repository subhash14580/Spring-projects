import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greeting")
public class Greeting extends HttpServlet{
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		   String inp1= request.getParameter("inp1");
		   String inp2 = request.getParameter("inp2");
		   int result = Integer.parseInt(inp1) + Integer.parseInt(inp2);
		  PrintWriter out = response.getWriter();
		  out.print("The final sum is "+result);
		  RequestDispatcher rd = request.getRequestDispatcher("/Transaction.jsp");
		}
}
