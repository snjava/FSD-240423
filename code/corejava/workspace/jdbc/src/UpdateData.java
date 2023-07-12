import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Quantity : ");
		int qty = scan.nextInt();
		scan.close();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd24april","root","root");
			PreparedStatement stmt = con.prepareStatement("UPDATE product SET quantity=?  WHERE id=?");
			stmt.setInt(1, qty);
			stmt.setInt(2, id);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " rows Updated...");
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
