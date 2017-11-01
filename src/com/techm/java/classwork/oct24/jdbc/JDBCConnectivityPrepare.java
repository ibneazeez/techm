package com.techm.java.classwork.oct24.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCConnectivityPrepare {
	
	// 1. Loading the Driver
	// 2. Creating the Connection
	// 3. Preparing Statement
	// 4. Executing Query
	// 5 Processing the result set..
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/imt?"
                            + "user=root&password=root");
			//Statement st = connect.createStatement();
			
			PreparedStatement pst = connect.prepareStatement("select * from user_inc where user_name =? and password=?");
			
			
			/*String userName = "anees";
			String password = "anees";*/
			
			pst.setString(1, "anees");
			pst.setString(2, "anees");
			
			//ResultSet resultSet = st.executeQuery("select * from user_inc where user_name='" + userName +"' AND  password= '" + password +"'");
			
			ResultSet resultSet = pst.executeQuery();
			
			String user_id = null;
			String name = null;
			while(resultSet.next()){
				user_id = resultSet.getString("user_id");
				name = resultSet.getString("first_name");
				
				System.out.println(" The user name is " + name + "  with Id " + user_id);
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
