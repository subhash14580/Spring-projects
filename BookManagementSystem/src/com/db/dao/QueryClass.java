package com.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.pojo.Book;

public class QueryClass {
		public int addBookDetails(Book b) {
			Connection con = connect();
			try {
			PreparedStatement pst = con.prepareStatement("insert into Book values(?,?,?,?)");
			pst.setInt(1, b.getId());
			pst.setString(2, b.getTitle());
			pst.setString(3, b.getAuthor());
			pst.setDouble(4, b.getPrice());
			pst.executeQuery();
			}catch(Exception e) {
				e.printStackTrace();
				return -1;
			}
			return 1;
		}
		public void getBookDetails(String name) {
			Connection con = connect();
			try {
			PreparedStatement pst = con.prepareStatement("select * from book where book_name like %?%");
			pst.setString(1, name);
			pst.executeQuery();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		public int updateBookDetails(Book book) {
			Connection con = connect();
			try {
			PreparedStatement pst = con.prepareStatement("update book set book_id=?,price = ?,title=?,author=? where book_id = ?");
			pst.setInt(1, book.getId());
			pst.setString(3, book.getTitle());
			pst.setString(4, book.getAuthor());
			pst.setDouble(2, book.getPrice());
			int i = pst.executeUpdate();
			return i;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return -1;
		}
		public static Connection connect() {
			Connection con = null;
			try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/subhash?user=root&password=password");
			con.setAutoCommit(true);
			}catch(Exception  e) {
				
			}
			return con;
		}
}
