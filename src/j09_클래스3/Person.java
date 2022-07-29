package j09_클래스3;

public abstract class Person {
	private String name;
	private int age;
	// private되어있으면 같은 클래스 내에서만 사용가능함
	// getter, setter와 생성자로 값을 입력받음
	
	public Person() { // 아래에서 오버로드(매개변수가 다름)를 한다면 main에서 기본생성자를 사용할 수 없으므로 기본생성자를 따로 정의해줘야함
	}
	
	public Person(String name, int age) {
		super();
		this.name = name; // this(자기자신의 주소).(참조)
		this.age = age;
		
	}
	
	
	public void test() {
		System.out.println(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name; // 지역변수에 다른 name이 없으므로 this미사용
	}
	
	public abstract String mealTime();

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
