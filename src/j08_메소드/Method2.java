package j08_메소드;

public class Method2 {
	/*
	 * 반환자료형, 리턴자료형
	 * 반환값, 리턴값
	 * 메소드명, 함수명
	 * 파라미터, 매개변수
	 * 메소드(함수) 정의
	 * 메소드(함수) 호출(콜)
	 * 
	 */
	
	
	//반환도 없고 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	//반환이 없고 매개변수가 하나인 메소드
	public static void test2(int num) { // int - 정수만 받을 수 있음
		System.out.println("num: " + num);
		System.out.println("test2 메소드 호출");
	}
	
	//반환이 없고 매개변수가 두개인 메소드
	public static void test3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println("test3 메소드 호출");
	}
	
	//반환은 있고 매개변수가 없는 메소드
	public static int test4() { 
		System.out.println("test4 메소드 호출");
		return 100;
	}
	
	//반환도 있고 매개변수도 있는 메소드
	public static String test5(String name, int index) {
		System.out.println("name: " + name);
		System.out.println("index: " + index);
		return name + index; // 리턴 자료형이 String이기 때문에 return할 내용을 붙여줘야함
	}
	
	//반환값이 없는 메소드에서 메소드를 강제로 탈출하는 방법
	public static void test6(String names) { // void > 리턴할게 없다
		while(true) {
			int tokenIndex = names.indexOf(", ");
			String name = tokenIndex != -1 ? names.substring(0, tokenIndex)
					: names;
			System.out.println(name);
			
			if(name.equals("김준삼")) {
				return; // 반복도 그만하고 메소드 자체를 빠져나와서 밑에 출력문이 실행이되지 않음 > void이기에 return뒤에 아무것도 안붙음
				// break일 경우 반복만 멈추고 출력문이 실행됨
			}
			
			if(tokenIndex == -1) {
				break;
			}
			
			names = names.substring(tokenIndex + 2);
		}
		System.out.println("메소드가 정상적으로 종료되었음.");
	}
	
	public static void main(String[] args) {
		test1();
		test1();
		test1();
		System.out.println();
		
		test2(1234);
		System.out.println();
		
		test3(1111, 2222);
		System.out.println();
		
		int a = test4();
		System.out.println(a);
		System.out.println();
		System.out.println(test4());
		System.out.println();
		
		String result = test5("김준일", 1); // test5 호출
		System.out.println(result); // 값만 출력
		System.out.println(result);
		System.out.println(result);
		System.out.println();
		
		String names = "김준일, 김준이, 김준삼, 김준사";
		test6(names);
		System.out.println("test6메소드 호출 후 출력");
	}

}
