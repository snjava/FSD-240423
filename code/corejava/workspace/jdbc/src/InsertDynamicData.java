import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scan.nextLine();
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Price : ");
		double price = scan.nextDouble();
		System.out.println("Enter Quantity : ");
		int qty = scan.nextInt();
		scan.close();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd24april","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO product VALUES(?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setDouble(3, price);
			stmt.setInt(4, qty);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " rows inserted...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}








