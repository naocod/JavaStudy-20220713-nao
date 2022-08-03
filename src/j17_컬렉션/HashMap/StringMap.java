package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class StringMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		HashMap<String, String> strMap2 = new HashMap<String, String>();
		
		strMap.put(1, "java");
		strMap.put(2, "java");
		strMap.put(3, "java");
		strMap.put(4, "java"); // 키값이 같을 경우 마지막에 들어간 값이 입력됨
		
		System.out.println(strMap);
		
		strMap2.put("a", "pythin");
		strMap2.put("b", "pythin");
		strMap2.put("c", "pythin");
		strMap2.put("d", "pythin");
		
		System.out.println(strMap2);
		
		strMap.get(10);
		
		Iterator<Integer> irKey = strMap.keySet().iterator();
		while(irKey.hasNext()) {
			System.out.println(strMap.get(irKey.next()));
		}
		
		strMap.entrySet().forEach(arg -> {
			System.out.println(arg);
			System.out.println(arg.getKey());
			System.out.println(arg.getValue());
		});
		
	}
}
