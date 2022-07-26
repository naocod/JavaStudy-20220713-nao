package j09_클래스2.user;

import j09_클래스2.Student;
import j09_클래스2.StudentService;

public class UserMain {
	
	/*
	 * 사용자 정보 시스템
	 * username(사용자 이름) > ID
	 * password(비밀번호)
	 * name(이름)
	 * email(이메일
	 * 
	 * user
	 * UserService
	 */

	public static void main(String[] args) {
		
		int userCount = 2;
		
		User[] userArray = new User[userCount];
		
		UserService service = new UserService(userArray);
		
		while(service.showMainMenu()) {}
		System.out.println("프로그램 종료");

	}

}
