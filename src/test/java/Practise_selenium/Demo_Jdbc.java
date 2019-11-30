package Practise_selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_Jdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		

		// Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thala?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "root");

		Statement sta = connection.createStatement();

		// String hi="update thala.aijth set username='sandy' where id=10";
		//String hi = "insert into thala.aijth values (22,'jack','hack')";

		//sta.executeUpdate(hi);

		//ResultSet rs = sta.executeQuery("delete id,username from thala.aijth where id=1");
		
			sta.executeUpdate("delete from thala.aijth where id=5");

		/*while (rs.next()) {

			System.out.println(rs.getInt(1) + rs.getString(2));
		}
*/
		connection.close();

		System.out.println("it isok ");

	}

}
