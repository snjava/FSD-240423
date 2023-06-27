import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(123);
		set.add("Abc");
		set.add(1.23);
		set.add(123);
		set.add(true);
		set.add(null);
		set.add('A');
		set.add(true);
		
		System.out.println(set);
	}
}
