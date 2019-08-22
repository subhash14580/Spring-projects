package com.user.usemanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.dao.QueryClass;
import com.pojo.Book;


public class UserManagement extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public static QueryClass queryClass = new QueryClass();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		System.out.println("action got is ::"+action);
		switch(action) {
			case "/insert":
			         insertBook(request,response);
			         break;
			case "/list" :
					//listAllBooks(request,response);
				    break;
			case "/delete":
		        // deleteBook(request,response);
		         break;
			case "/update" :
				//updateBook(request,response);
			    break;
}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
	
	public static void  insertBook(HttpServletRequest request, HttpServletResponse response) {
	    int book_Id = Integer.parseInt(request.getParameter("book_id"));
	    String author = request.getParameter("author");
	    Double price = Double.parseDouble(request.getParameter("price"));
	    String title = request.getParameter("title");
	    Book book = new Book();
	    book.setId(book_Id);
	    book.setAuthor(author);
	    book.setPrice(price);
	    book.setTitle(title);
	    try {
		   if(queryClass.addBookDetails(book) == 1) {
			   response.sendRedirect("Success.jsp");
		   }else {
			   response.sendRedirect("Failure.jsp");
		   }
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	   
	    
	}
	

}
