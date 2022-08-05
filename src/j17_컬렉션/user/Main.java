package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	
	public static void main(String[] args) {
		
		/*
		 * Map 안에 리스트 안에 Map을 저장하는 구조를 배운다.
		 * 
		 */
		
		Map<String, Object> map = new HashMap<String, Object>();
		// 제네릭을 사용해서 Map을 가진 list 생성
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		// 클래스 객체와 비슷
		Map<String,Object> todoMap1 = new HashMap<String, Object>();
		todoMap1.put("todoCode", 182);
		todoMap1.put("todo", "스프링 부트 서버 테스트_182");
		todoMap1.put("todoComplete", true);
		todoMap1.put("importance", false);
		todoMap1.put("totalCount", 157);
		todoMap1.put("incompleteCount", 78);
		
		Map<String,Object> todoMap2 = new HashMap<String, Object>();
		todoMap2.put("todoCode", 182);
		todoMap2.put("todo", "스프링 부트 서버 테스트_182");
		todoMap2.put("todoComplete", true);
		todoMap2.put("importance", false);
		todoMap2.put("totalCount", 157);
		todoMap2.put("incompleteCount", 78);
		
		
		list.add(todoMap1);
		list.add(todoMap2);
		
		map.put("code", 1);
		map.put("message", "1page list success to load");
		// map에 list 데이터를 넣어줌으로써 map 안에 list 안에 map 구조
		map.put("data", list);
		
		System.out.println(map);

		
	}

}
