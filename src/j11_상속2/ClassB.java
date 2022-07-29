package j11_상속2;

public class ClassB extends ClassA {

	public ClassB() {
		super(); // 생략되어 있음
//		new ClassA();  // 상속받은 부모클래스(ClassA)가 아닌 다른 클래스(ClassA) 
		// ClassA가 추상화될 경우 생성이 안되므로 new ClassA 불가능. 하지만 자식 클래스의 생성자가 생성될 시점에서 super()는 자동 생성됨 
		System.out.println("첫번째(B) 자식 클래스 생성자 호출");
		System.out.println();
//		super.printInfo(); // 부모 클래스의 메소드 
		
	}
	
	@Override // 오버라이드-재정의
	public void printInfo() { //부모 메소드를 자식 클래스에서 재정의함 
		System.out.print("첫번째(B) 자식 ");
		super.printInfo();
	}
	
	@Override
	public void showData() {
		System.out.println("총을 만들어서 쏠 준비를 한다.");
	}
	
	public void addData() {
		System.out.println("데이터를 추가합니다.");
	}
}
