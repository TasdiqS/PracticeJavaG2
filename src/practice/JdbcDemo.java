//package practice;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JdbcDemo {
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		// TODO Auto-generated method stub
//		//load the driver and register the driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		//establish a connection
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb","root","root");
//		
////		System.out.println(con);
//		Statement stmt=con.createStatement();
//		stmt.executeUpdate("create table MyEmployees3 ( "
//			      + "   id INT PRIMARY KEY, firstName VARCHAR(20), lastName VARCHAR(20), "
//			      + "   title VARCHAR(20), salary INT )");
//		System.out.println("MyEmployees3 table created in jdbcdb");
//		}
//
//}
