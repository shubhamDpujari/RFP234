package jdbc;

import java.sql.SQLException;

public class Jdbcconnect {

	public static void main(String[] args) {
		Jdbcconnect jdbc = new Jdbcconnect();
		jdbc.connection();
		
		
	}
	void connection() {
		try {
			Class.forName(className:"com.mysql.jdbc.Driver");
			System.out.println("Driver name");
			DriverManager.getconnection("jdbc:mysql://localhost:3306/school",user"root",password:"Shubham@24");
			
		
		}catch (ClassNotFoundException e) {
			System.out.println("class is not found please check");
		}catch(SQLException e) {
			System.out.println("sql exception is occured");
		}
		e.printStackTrace();
	}
	

}
