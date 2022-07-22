package j09_클래스.접근지정자.a;

public class TestA_2 {
	int ta2;
	
	public TestA_2() {
	}
	
	public void testA2() {
		System.out.println("TestA-2 메소드 호출");
		System.out.println();
		
		TestA testA = new TestA();
//		testA.ta1 = "테스트A-2에서 값 주입"; // 동일한 패키지 안에있더라도testA private이면 사용할 수 없음. 같은 클래스안에서만 호출 가능
		testA.testA1();
//		System.out.println(testA.ta1);
	}

}
