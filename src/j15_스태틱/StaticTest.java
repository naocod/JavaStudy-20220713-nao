package j15_스태틱;

public class StaticTest {
	
	public static String name;
	private int age;
	
	public static void printTest() { // 생성되지 않았기때문에 this 자기 자신의 주소가 없어서 사용불가
		System.out.println("출력");
		System.out.println(name);
	}

}
