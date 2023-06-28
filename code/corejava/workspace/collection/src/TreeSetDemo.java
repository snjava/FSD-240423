import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(23);
		set.add(231);
		set.add(13);
		set.add(21);
		set.add(32);
		set.add(111);
		set.add(23);
		
		System.out.println(set); // [13, 21, 23, 32, 111, 231]
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.ceiling(23)); // grater than equal to
		System.out.println(set.higher(23)); // grater than
		System.out.println(set.floor(23)); // smaller than equal to
		System.out.println(set.lower(23)); // smaller than
		
		System.out.println(set.headSet(32));
		System.out.println(set.tailSet(32));
		
		NavigableSet descSet = set.descendingSet();
		System.out.println(descSet);
		
	}
}




