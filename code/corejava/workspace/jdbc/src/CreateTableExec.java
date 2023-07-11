import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTableExec {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd24April","root","root");
			PreparedStatement smt = con.prepareStatement("CREATE TABLE product(id int primary key, name varchar(30), price double, quantity int)");
			int result = smt.executeUpdate();
			con.close();
			System.out.println("Table Created...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
