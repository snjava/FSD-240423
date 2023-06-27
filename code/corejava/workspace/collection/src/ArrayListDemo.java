import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//Vector list = new Vector();
		list.add(123); // Integer
		list.add(23.43);
		list.add("Abc");
		list.add('A');
		list.add(123);
		list.add(true);
		list.add(null);
		System.out.println(list);
		list.remove(new Integer(123));
		System.out.println(list);
		System.out.println(list.contains("Xyz"));
		System.out.println(list.size());
		//list.clear();
		//System.out.println(list);
		
		ArrayList list1 = new ArrayList();
		list1.add(999);
		list1.add("Pqr");
		list1.add(44.55);
		
		list.addAll(list1);
		System.out.println(list);
		System.out.println(list.containsAll(list1));
		//list.removeAll(list1);
		list.retainAll(list1);
		System.out.println(list); 	// [999, Pqr, 44.55]
		System.out.println(list.isEmpty());
		
		list.add(0, 111); 
		System.out.println(list); // [111, 999, Pqr, 44.55]
		list.remove(1);
		System.out.println(list); // [111, Pqr, 44.55]
		System.out.println(list.get(1));
		list.set(1, "Xyz");
		System.out.println(list);
	}
}
