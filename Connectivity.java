package com.BankManagementSys;

import java.sql.*;

public class Connectivity {
	Connection con;
	Statement s;
	
	public Connectivity() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagementSystem","root","adeshpol141546");
			
			s = con.createStatement();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
