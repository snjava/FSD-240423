import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd24April","root","root");
			System.out.println("DB Connection Success..");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
