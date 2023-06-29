import java.util.Iterator;
import java.util.LinkedList;

public class CustomObjectCollection {
	public static void main(String[] args) {
		Product p1 = new Product(111,"Smart TV", 45645.45, 2);
		Product p2 = new Product(11,"Smart Watch", 4545.45, 1);
		Product p3 = new Product(221,"Smart Mobile", 25645.45, 1);
		Product p4 = new Product(113,"Headphone", 455.45, 3);
		
		LinkedList<Product> list = new LinkedList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		Iterator<Product> it = list.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			System.out.print(p.id + "\t");
			System.out.print(p.name + "\t");
			System.out.print(p.qty + "\t");
			System.out.print(p.price + "\n");
		}
		System.out.println("================================================");
		for(Product p : list) {
			System.out.print(p.id + "\t");
			System.out.print(p.name + "\t");
			System.out.print(p.qty + "\t");
			System.out.print(p.price + "\n");
		}
		
	}
}

class Product {
	int id;
	String name;
	double price;
	int qty;
	public Product(int id, String name, double price, int qty) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
}