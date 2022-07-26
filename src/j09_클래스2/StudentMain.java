package j09_클래스2;

public class StudentMain {
	/*
	 * 생성이 되어야지 클래스, 메소드를 사용할 수 있음
	 */
	public static void main(String[] args) {
		
		int studentCount = 2;
		
		Student[] studentArray = new Student[studentCount];
		
		StudentService service = new StudentService(studentArray);
		
		while(service.showMainMenu()) {} // 1. 조건검사 > 메소드 호출
		System.out.println("프로그램 종료");
		
		
		
//		Student student = new Student(); // Heap에 주소를 할당받아 변수에 저장
//		Student student2 = new Student("김준일", 2, "부산", "010-9988-1916");
		
//		StudentMain main = new StudentMain();
//		main.printArray(); // < StudentMain 클래스를 생성해야지만 printArray 메소드를 사용할 수 있음
	}	
	
//	public void printArray() {
//		System.out.println("test");
//	}

}
