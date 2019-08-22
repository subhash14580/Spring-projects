import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DatabaseConnectivity;

@WebServlet("/login")
public class Login extends HttpServlet {
	public void init() {
		System.out.println("init method");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + " " + password);
		boolean result = DatabaseConnectivity.jdbc(username, password);
		PrintWriter out = response.getWriter();
		try {
			if (result) {
			//	out.print("" + "Hello " + username);
				request.setAttribute("Message", "vivek"+username);
				  RequestDispatcher rd = request.getRequestDispatcher("SuccessLogin.jsp");
				  rd.forward(request, response);
			} else {
				out.print("Failure");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



	public void destroy() {
		System.out.println("destroy");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + " " + password);
		boolean result = DatabaseConnectivity.jdbc(username, password);
		PrintWriter out = response.getWriter();
		try {
			if (result) {
				//out.print("" + "Hello " + username);

				request.setAttribute("Message",  "vivek"+username);
				
				  RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
				  rd.forward(request, response);
				 
			} else {
				out.print("Failure");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
