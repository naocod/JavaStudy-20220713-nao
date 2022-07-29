package j11_상속2;

public class ClassTestMain {

	public static void main(String[] args) {
		
		((ClassA) new ClassB()).showData();
		// ()를 통해 업캐스팅할 자료형을 입력하여 형변환을 하고 전체를 괄호로 묶어 참조하여 ClassA의 메소드 사용 가능
		
		ClassB bb = new ClassB();
		ClassA aa = bb; // ClassB로 정의된 bb를 ClassA로 형변환하여 변수 aa에 담아줌, 업캐스팅은 묵시적 형변환이 가능하기 때문에 (ClassA) 생략가능
		
		ClassA aaa = new ClassB(); // 위에 두줄을 한줄로 축약
		
		((ClassA) bb).showData(); 
		((ClassA) bb).printInfo();
		
		aa.showData(); // 위와 같음
		aa.printInfo();
		
		// 생성자 호출
		// new ClassA(); 만으로도 생성자 호출, 주소값 생성
		ClassA b = new ClassB(); // < 자식 클래스인 B가 호출될 때 기본생성자에 부모 클래스의 생성자(super())가 생략되어있어 같이 호출됨
		b.printInfo();
		b.showData();
		// ClassA에 ClassB가 상속되어있기 때문에 위와 같이 업캐스팅 가능
		
		
		ClassA c = new ClassC(); // 해당 객체의 주소를 담는 변수
		c.printInfo(); // 부모클래스에 상속되었기에 부모클래스의 메소드 사용가능
//		new ClassC().printInfo(); //ClassC c = new ClassC();
								  //ClassC c = new ClassC();와 같음 하지만 매번 생성하면 주소값이 변경되기 때문에 이렇게 사용하지 않고 변수에 주소값을 저장하여 사용함.
		c.showData();
	}

}
