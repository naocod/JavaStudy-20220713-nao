package j09_클래스.생성자;

public class ConstructorEx2 {
	
	String name; // 매개변수의 name과 다름
	int age;
	
	public ConstructorEx2() {} // 기본생성자 외에 오버로딩하면 기본생성자가 비활성화되어 사용할 수 없기에 따로 명시해줘야 함

	public ConstructorEx2(String name) { // 단축키 Alt + Shift + s > Generate Constructor using Fields
		this.name = name;
	}

	public ConstructorEx2(int age) {

		this.age = age;
	}

	public ConstructorEx2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
