package j15_스태틱;

public class MainStaticTest {
	
	public void printTest() {
		System.out.println("출력");
	}
	
	public static void main(String[] args) {
		
		MainStaticTest mainStaticTest = new MainStaticTest();
		mainStaticTest.printTest(); // 객체가 생성되야지만 호출 가능함
	}

}
