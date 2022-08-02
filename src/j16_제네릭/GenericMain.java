package j16_제네릭;

import j14_lombok.Car;

public class GenericMain {
	
	public static void main(String[] args) {
		GenericTest<Integer, String> genericTest = new GenericTest<Integer, String>(); // 생성하는 시점에서 자료형을 바꿔줄 수 있다
		GenericTest<String, Car> genericTest2 = new GenericTest<String, Car>();
		
		genericTest.setKey(100);
		genericTest.setValue("원");
		
		System.out.println(genericTest.getKey() + genericTest.getValue());
	}

}
