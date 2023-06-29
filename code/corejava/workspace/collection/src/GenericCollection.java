import java.util.ArrayList;

public class GenericCollection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Abc");
		list.add("Xyz");
		list.add("Pqr");
		list.add("Abc");
		list.add("Lmn");
		
		System.out.println(list);
	}
}
