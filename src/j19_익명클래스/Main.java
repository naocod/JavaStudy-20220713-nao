package j19_익명클래스;

public class Main {

	public static void main(String[] args) {
		AbstractTest abstractTest = new AbstractTestImpl(); // 상속시켜서 AbstractTest 사용가능
		
		abstractTest.add(10, 20);
		abstractTest.showData("JSON");
		
		AbstractTest abstractTest2 = new AbstractTest() { // 다른곳에서 추가 사용없이 한번만 사용할 때 정의
			
			@Override
			public void showData(String data) {
				System.out.println("여기에서만 사용가능한 data");
			}
			
			@Override
			public void add(int num1, int num2) {
				System.out.println("더할 때 딱 한번만 사용함");
			}
		};
		
		abstractTest2.add(10, 20);
		abstractTest.showData(null);
		abstractTest.add(30, 10);
		
		
	}
}
