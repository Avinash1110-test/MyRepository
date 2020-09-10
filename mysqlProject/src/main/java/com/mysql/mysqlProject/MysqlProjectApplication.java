package com.mysql.mysqlProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class MysqlProjectApplication {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/practicedb";
		String username = "root";
		String password = "Avinash@1110";
		String query = "select * from practicedb.abhi_dev";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url , username , password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		String fulldata;

		while (rs.next()) {

			fulldata =  rs.getString(1) + " : " +
						rs.getInt(2)    + " : " +
						rs.getString(3) + " : " +
						rs.getString(4);

			System.out.println(fulldata);
		}

		st.close();
		con.close();

	}

}
