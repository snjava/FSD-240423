import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(121, "A");
		map.put(21, 'B');
		map.put(11, true);
		map.put(12, "D");
		map.put(131, 333);
		map.put(121, 45.43);
		
		System.out.println(map);	// {11=true, 12=D, 21=B, 121=45.43, 131=333}
		
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry());
		
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
		
		System.out.println(map.headMap(121));
		System.out.println(map.tailMap(121));
		
		System.out.println(map.ceilingKey(21)); //21
		System.out.println(map.ceilingEntry(21)); // 21=B
		
		System.out.println(map.higherKey(21)); // 121
		System.out.println(map.higherEntry(21)); // 121=45.43
		
		System.out.println(map.floorKey(21)); //21
		System.out.println(map.floorEntry(21)); // 21=B
		
		System.out.println(map.lowerKey(21)); // 12
		System.out.println(map.lowerEntry(21)); // 12=D
		
		NavigableMap descMap = map.descendingMap();
		System.out.println(descMap);
	}
}
