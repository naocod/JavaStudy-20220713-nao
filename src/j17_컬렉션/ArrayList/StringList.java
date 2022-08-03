package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // string 값을 담을 배열을 생성하여 그 주소를 list 변수에 담음
		
		// 1. 값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("html");
		
		// 원하는 위치에 값 추가
		list.add(1, "css");
		System.out.println("1.\t" + list);
		
		// 2. 리스트의 크기
		System.out.println("2.\tlist 크기:\t" + list.size()); // .size() > 배열의 크기를 알려줌 
		
		// 3. 리스트 toString()	 > 모든 컬렉션은 toString을 지원함
		System.out.println("3.\t" + list); // 
		
		// 4. 리스트에서 해당 인덱스로 값 찾기
		String subject = list.get(0);
		System.out.println("4.\t0번 인덱스의 값:" + subject);
		
		// 5. 리스트에서 인데스 찾는 방법
		int findIndex = list.indexOf("python");
		System.out.println("5.\tpython이 있는 위치:" + findIndex);
		
		// 6. 해당 인덱스 위치의 값을 수정
		list.set(3, "c++");
		System.out.println("6.\t" + list);
		
		// 7. 해당 리스트가 값을 포함하고 있는지 확인
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("python");
		tempList.add("c++");
		tempList.add("spring");
		System.out.println("7-1.\t" + tempList);
		
		boolean contains = list.contains("java");	// list에 java가 있는지
		boolean containsAll = list.containsAll(tempList);	// list의 값과 같은지
		System.out.println("7-2.\tcontains:" + contains);
		System.out.println("7-3.\tcontainsAll:" + containsAll);
		
		// 8. 다른 컬렉션의 데이터를 모두 추가
		list.addAll(tempList);
		System.out.println("8.\t" + list);
		
		// 9. 값 삭제
		list.remove("python"); // 중복값이 있을 경우 앞에 있는 값부터 지움
		System.out.println("9-1.\t" + list);
		list.remove(5);
		System.out.println("9-2.\t" + list);
		list.removeAll(tempList); 
		System.out.println("9-3.\t" + list);
		
		// 10. 해당 컬렉션을 포함하는 것을 제외하고 다 지움
		list.retainAll(tempList); 
		System.out.println("10.\t" + list);
		
		// 11. 리스트가 비었는지 확인
		System.out.println("11.\t" + list.isEmpty());
		
		// 12. 리스트 전체 비우기
		list.clear();
		System.out.println("12-1.\t" + list);
		System.out.println("12-2.\t" + list.isEmpty());
		
		List<String> asList = Arrays.asList(new String[] {"java", "python", "c++", "html"}); // 자료형 > 인터페이스 list o, 자료형 list x
		System.out.println(asList);
		// 다운캐스팅할 경우 옮겨 담으면 됨
		list.addAll(asList);
		System.out.println(list);
		
		
		for(int i = 0; i < list.size(); i++) { // 인덱스가 필요한 경우
			System.out.println(list.get(i));
		}
		System.out.println("<<<< foreach >>>>");
		// foreach > 인덱스가 없어도 되는 경우
		for(String str : list) {
			System.out.println(str);
		}
		
		String roles = "USER,ADMIN,TEST_USER";
		String[] roleArray = roles.split(",");
		System.out.println(roleArray[0]);
		System.out.println(roleArray[1]);
		System.out.println(roleArray[2]);
		Arrays.asList(roleArray).forEach(arg -> {	// 메소드화 시켜놓음
			System.out.println("role: " + arg);
		});
		
		
	}

}
