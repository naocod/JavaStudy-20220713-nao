package j09_클래스.캡슐화;

import java.util.Scanner;

public class UserService {
	
	private User user;
	private Scanner scanner;
	
	public UserService() {
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		if(isStrBlank(username)) { // .trim > 공백을 지워줌
			// .isEnpty 스페이스바는 공백이지만 글자로 인식함 > 아예 비어있으면 종료
			return; // 메소드를 강제로 빠져나옴
		}
		
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		if(isStrBlank(password)) {
			return;
		}
		
		System.out.print("이름: ");
		name = scanner.nextLine();
		if(isStrBlank(name)) {
			return;
		}
		
		System.out.print("이메일: ");
		email = scanner.nextLine();
		if(isStrBlank(email)) {
			return;
		}
	}

	private boolean isStrBlank(String str) {
		return str == null || str.trim().isEmpty(); // => .trim.isEmpty();
	}

}
