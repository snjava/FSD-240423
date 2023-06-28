import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(123, "Abc");
		map.put("Xyz", 123);
		map.put(123, "xyz");
		map.put(1.23, 456.5);
		map.put(true, 'X');
		map.put(null, 'X');
		map.put(111, null);
		map.put(121, null);
		
		System.out.println(map);
		map.remove(123, "xyz");
		System.out.println(map);
		
		System.out.println(map.containsKey(1.23));
		System.out.println(map.containsValue(123));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println(map.get("Xyz"));
		
		map.clear();
		System.out.println(map);
	}
}
