package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;



public class DatabaseConnectivity {
	public static boolean jdbc(String username, String password) {
		 Connection con;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			//"jdbc:mariadb://localhost:3306/DB?user=root&password=password"
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/subhash?user=root&password=password");
			PreparedStatement st = 
					con.prepareStatement("Select * from login where username = ? and password = ?");
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return false;
	 }
}
