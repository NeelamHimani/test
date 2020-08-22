package Pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Database_Connection {

		String URL = "jdbc:mysql://13.234.135.237:3306/?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		Statement stmt;
		Connection con;

	
		public void Connection() throws Exception {
			// Load driver
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(URL, "qa_team", "P0w3Rfu!!Q@123");
			stmt = con.createStatement();

		}

	
		public void CloseConnection() throws Exception {
			// close connection
			Connection con = DriverManager.getConnection(URL, "qa_team", "P0w3Rfu!!Q@123");
			con.close();

		}

	}

	


