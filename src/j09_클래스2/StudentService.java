package j09_클래스2;

import java.util.Scanner;

public class StudentService { // Service Class 기능을 구조화함 
	
	
	private Scanner scanner;
	private Student[] studentArray; // 배열 자료형의 변수 생성
	
	public StudentService(Student[] studentArray) {
		this.studentArray = studentArray;
		this.scanner = new Scanner(System.in);
	}
	
	public boolean showMainMenu() {
		String select = null;
		
		System.out.println("[학생 등록 시스템]");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 리스트 조회");
		System.out.println("q. 프로그램 종료");
		System.out.print("메뉴 선택 >> ");
		
		select = scanner.nextLine();
		if(select.equals("1")) {
			Student student = addStudent();
			if(student != null) {
				System.out.println(student.toString());				
			}
		}else if(select.equals("2")) {
			
		}else if(select.equals("q")) {
			System.out.println("프로그램 종료중...");
			return false;
		}else {
			System.out.println("해당 메뉴는 선택할 수 없습니다.");
			System.out.println("다시 입력하세요.");
		}
		
		System.out.println();
		
		return true;
	}
	
	public Student addStudent() {
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i] != null) { // 비어있는 공간을 찾음
				continue;
			}
			studentArray[i] = inputStudent();
			System.out.println("[ " + studentArray[i].getStudentName() + " ] 학생 등록 완료");
			return studentArray[i]; // for문도 빠져나가고 메소드도 빠져나가서 아래 명령문 실행 x
		}
		System.out.println("더 이상 학생을 등록할 수 없습니다."); // 배열이 다 참
		return null;
	}
	
//	private Student outputStudent() {
//		for(int i = 0; i < studentArray.length; i++) {
//			System.out.println();
//		}
//	}
	
	private Student inputStudent() { // 학생 한명 주소 리턴, 학생을 등록할 때 addStudent에서 사용하므로 외부에서 쓸 일이 없어 private
		String studentName = null; // 지역변수, inputStudent 메소드 안에서만 사용
		int studentYear = 0;
		String studentAddress = null;
		String studentPhone = null;
		
		System.out.println("[학생 등록]");
		System.out.print("이름 >> ");
		studentName = scanner.nextLine();
		
		System.out.print("학년 >> ");
		studentYear = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("주소 >> ");
		studentAddress = scanner.nextLine();
		
		System.out.print("연락처 >> ");
		studentPhone = scanner.nextLine();
		
		Student s = new Student(studentName, studentYear, studentAddress, studentPhone); // 객체를 만듬
		
		return s;
	}

}
