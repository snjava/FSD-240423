import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd24April","root","root");
			PreparedStatement smt = con.prepareStatement("INSERT INTO product VALUES(1, 'Smart TV', 35000, 2)");
			int result = smt.executeUpdate();
			con.close();
			System.out.println(result + " : Rows Inserted..");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
