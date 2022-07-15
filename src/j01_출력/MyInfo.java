package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		
		char name1 = '임';
		char name2 = '나';
		char name3 = '영';
		String name = "임나영";
		
		int age = 25;
		
		String address = "부산 부산진구 개금동";

		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3); // 문자열과 같이 입력하지 않고 문자 자료형만을 출력하면 자료의 크기가 더해져서 출력됨
		// 출력문에서 문자열 뒤의 문자들은 문자열로 인식됨. ex) "결과: " + 10 + 20 > 결과: 1020 / 결과: > 결과: 10 > 결과: 1020
		// 순서대로 일을 처리하기 때문에 발생하는 현상. 이를 해결하기 위해 괄호로 우선순위를 정한다. ex) "결과: " + (10 + 20) > 결과: 30
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();

		System.out.print("이름: ");
		System.out.println(name);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 부산진구 개금동");
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("임나영");
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산 부산진구 개금동");
		System.out.println();
		
	}

}
