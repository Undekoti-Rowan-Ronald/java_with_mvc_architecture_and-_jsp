import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class Jdbc_util {

	 static {
		 
//			TO LOAD AND REGISTER DRIVER
		
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				}
		
	}
	 
	 public static Connection getConnection() throws SQLException {
//			Establish the connection using DriverManager class and implementing connection interface ;
			String url="jdbc:mysql://localhost:3306/jdbc_learning";
			String user="root";
			String password="123456789";
			return DriverManager.getConnection(url, user, password);
	 }
	 
	 public static void closeConnection(Connection connect ,Statement statement) throws SQLException {
//		 
//			update.close();
			//close statement 
			 statement.close();
            //close connection 
			 connect.close();
	 }
	
}
