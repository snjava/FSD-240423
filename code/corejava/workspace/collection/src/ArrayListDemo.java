import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(123); // Integer
		list.add(23.43);
		list.add("Abc");
		list.add('A');
		list.add(123);
		list.add(true);
		list.add(null);
		System.out.println(list);
	}
}
