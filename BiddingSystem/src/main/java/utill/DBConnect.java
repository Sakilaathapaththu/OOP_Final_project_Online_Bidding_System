package utill;




import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/online_bidding_system";
	private static String username = "root";
	private static String password ="sakila";
	private static Connection con;
	
	public static Connection getConnection() {
	
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			System.out.println("Data base connection is not success!!");
		}
		
		return con;
	}
	

}
