

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class adding
 */
@WebServlet("/adding")
public class adding extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adding() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("inp1"));
		int num2 = Integer.parseInt(request.getParameter("inp2"));
		
		PrintWriter out = response.getWriter();
		try {
			int result = num1/num2;
				out.print("" + "result is  " + result);
			
		} catch (Exception e) {
				String s = e.getMessage();
				//e.printStackTrace();
				//e.toString()
			//out.println("Exception caused by "+e.toString());
			
				RequestDispatcher rd = request.getRequestDispatcher("ErrorPage.jsp");
			//RequestDispatcher rd = request.getRequestDispatcher("/ErrorPage.jsp");
			
			request.setAttribute("errormessage", "Exception caused by "+e.toString());
			rd.forward(request, response);
		}

	}

}
