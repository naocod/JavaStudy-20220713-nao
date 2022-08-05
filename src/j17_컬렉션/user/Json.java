package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Json {
	
	public static void main(String[] args) {
		
		
		Map<String, Object> json = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		
		Map<String, Object> data1 = new HashMap<String, Object>();
		data1.put("name", "bulbasaur");
		data1.put("url", "https://pokeapi.co/api/v2/pokemon/1/");

		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("name", "ivysaur");
		data2.put("url", "https://pokeapi.co/api/v2/pokemon/2/");
		
		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("name", "venusaur");
		data3.put("url", "https://pokeapi.co/api/v2/pokemon/3/");
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		
		json.put("count", 1118);
		json.put("next", "https://pokeapi.co/api/v2/pokemon/?offset=3&limit=3");
		json.put("previous", null);
		json.put("result", list);
		
		System.out.println(json);
		
		
	}
}
