import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd24April","root","root");
			PreparedStatement smt = con.prepareStatement("SELECT * FROM product");
			ResultSet result = smt.executeQuery();
			
			while(result.next()) {
				/*System.out.println(result.getInt("id"));
				System.out.println(result.getString("name"));
				System.out.println(result.getDouble("price"));
				System.out.println(result.getInt("quantity"));*/
				System.out.println(result.getInt(1));
				System.out.println(result.getString(2));
				System.out.println(result.getDouble(3));
				System.out.println(result.getInt(4));
				System.out.println("========================");
			}
			
			con.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
