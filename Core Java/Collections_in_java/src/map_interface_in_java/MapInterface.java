package map_interface_in_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {
		/* Map:
		 * ====
		 *  When you represent a group of individual object as a single entity 
		 *  in  the form of key value pair then we should for map interface
		 */
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hello");
		map.put(1, "Hello");
		map.put(2, "Hello");
		map.put(3, "Hello");
		map.put(6, "Hello");
		map.put(null, "Hello");
		map.put(null, "Hello");
		System.out.println(map);
		System.out.println("Using entry set");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> keyValue :entrySet) {
			System.out.println(keyValue);
		}
		System.out.println("Using foreach");
		map.forEach((k,v)->System.out.println(k+"=>"+v));
		
		System.out.println("Using keyset");
		Set<Integer> keySet = map.keySet();
		for(Integer key: keySet) {
			System.out.println(key+"=>"+map.get(key));
		}
	}
}
