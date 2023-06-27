import java.util.LinkedList;

public class LInkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(123);
		list.add("Abc");
		list.add(12.3);
		System.out.println(list);
		list.add(1, "Xyz");
		System.out.println(list); // [123, Xyz, Abc, 12.3]
		
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		list.push(888);
		System.out.println(list);
		list.addFirst(111);
		list.addLast(999);
		System.out.println(list);
		//list.removeFirst();
		//list.removeLast();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}
