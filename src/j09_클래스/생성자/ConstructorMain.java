package j09_클래스.생성자;

public class ConstructorMain {
	
	public static void main(String[] args) {
		ConstructorEx constructorEx1 = new ConstructorEx();
		ConstructorEx constructorEx2 = new ConstructorEx("김준일");
		ConstructorEx constructorEx3 = new ConstructorEx(29);
		ConstructorEx constructorEx4 = new ConstructorEx("김준일", 29);
		
		System.out.println(constructorEx2.name);
	}

}
