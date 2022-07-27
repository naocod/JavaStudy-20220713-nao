package j09_클래스2;

import java.util.Scanner;

public class StudentService { // Service Class 기능을 구조화함 
	
	//<클래스의 속성(변수)>
	private Scanner scanner;
	private Student[] studentArray; // 배열 자료형의 변수 생성
	
	public StudentService(Student[] studentArray) {
		this.studentArray = studentArray;		// 변수 초기화
		this.scanner = new Scanner(System.in);
	}
	
	private String inputSelect() {
		System.out.print("메뉴선택 >> ");
		return scanner.nextLine();
	}
	
	private void printSelectErrorMessage() {
		System.out.println("해당 메뉴는 선택 할 수 없습니다.");
		System.out.println("다시 입력하세요.");
	}
	
	public boolean showMainMenu() {
		String select = null;
		
		System.out.println("[학생 등록 시스템]");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 조회");
		System.out.println("q. 프로그램 종료");
	
		select = inputSelect();
		
		if(select.equals("1")) {  						// == : 리터럴상수를 비교, .equals : 문자열 비교
			Student student = addStudent();
			if(student != null) {
				System.out.println(student.toString());
			}
		}else if(select.equals("2")) {
			while(showStudentSearch()) {}
			
		}else if(select.equals("q")) {
			System.out.println("프로그램 종료중...");
			return false;
		}else {
			printSelectErrorMessage();
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
	
	private boolean showStudentSearch() {
		String select = null;
		
		System.out.println("[학생 조회]");
		System.out.println("1. 학생 전체 조회");
		System.out.println("2. 이름으로 검색");
		System.out.println("b. 뒤로가기");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			showStudentList();
			
		}else if(select.equals("2")) {
			showSearchStudent();
			
		}else if(select.equals("b")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return false;
		}else {
			printSelectErrorMessage();
		}
		System.out.println();
		return true;
		
	}
	
	private void showStudentList() {
		System.out.println("[학생 전체 조회]");
		System.out.println("이름\t\t학년\t\t주소\t\t연락처");
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i] != null) {
				System.out.println(studentArray[i].getStudentName() + "\t\t" 
						+ studentArray[i].getStudentYear() + "\t\t" 
						+ studentArray[i].getStudentAddress() + "\t\t"
						+ studentArray[i].getStudentPhone());				
			}
		}
		System.out.println();
	}
	
	private void showSearchStudent() {
		String searchName = null;
		
		System.out.println("[학생 이름으로 검색]");
		System.out.print("이름 >> ");
		searchName = scanner.nextLine();
		
		Student searchStudent = searchStudentByStudentName(searchName);
		if(searchStudent != null) {
			System.out.println(searchStudent.toString());
		}
		
	}
	
	private Student searchStudentByStudentName(String searchName) {
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i] != null) {
				String studentName = studentArray[i].getStudentName();
				if(searchName.equals(studentName)) {
					return studentArray[i];
				}
			}
		}
		System.out.println("해당 이름의 학생은 존재하지 않습니다.");
		return null;
		
	}

}
