package j11_상속2;

public class ClassTestMain2 {

	public static void main(String[] args) {
		
		int num = 10;
		int[] numbers = new int[2];
		numbers[0] = num;
		
		System.out.println(numbers[0]);
		
		ClassA b = new ClassB();
		ClassA[] arrayA = new ClassA[2]; // 생성당시 비어있음. 배열의 공간 생성
		// ClassA 객체를 넣을 수 있음
		arrayA[0] = b;
		arrayA[1] = new ClassC();
		
		arrayA[0].printInfo(); // 배열에 b객체의 주소값이 담겨있기에 ClassA의 printInfo 사용가능
		arrayA[1].printInfo(); // 오버라이드된 printInfo 출력
		
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i].printInfo(); // 업캐스팅되면 형태가 부모이기 때문에 부모 객체만 사용가능함 
			// 1. ClassB.printInfo();
			// 2. ClassC.printInfo();
			// 3. null.printInfo(); >> NullPointerException 오류가 뜸
		}
		
		ClassB b2 = (ClassB) arrayA[0];
		
		if(arrayA[0] instanceof ClassB) { // arrayA[0]가 업캐스팅되었지만 원래는 ClassB였는지 물어봄
			// 원래 가지고있던 자료형이 무엇이었는지 확인함
			System.out.println("클래스 B였음"); 
		}else {
			System.out.println("클래스 B가 아님");
		}
		
		
		for(int i = 0; i < arrayA.length; i++) {
			if(arrayA[0] instanceof ClassB) { 
				ClassB b3 = (ClassB) arrayA[i];
				b3.addData();
			}else if(arrayA[0] instanceof ClassC) {
				ClassC c3 = (ClassC) arrayA[i];
				c3.removeData();
			}else {
				System.out.println("다운캐스팅 불가");
			}
		}
	}

}
