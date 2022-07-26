package j09_클래스2.user;

import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class UserService {
	
	private Scanner scanner;
	private User[] userArray;
	
	public UserService(User[] userArray) {
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
	}
	
	private String inputSelect() {
		System.out.print("메뉴 선택 >> ");
		return scanner.nextLine();
	}
	
	private void printSelectErrorMessage() {
		System.out.println("해당 메뉴는 선택할 수 없습니다.");
		System.out.println("다시 입렵하세요.");
	}
	
	public boolean showMainMenu() {
		String select = null;
		
		System.out.println("사용자 정보 시스템");
		System.out.println("1. 사용자 등록");
		System.out.println("2. 사용자 조회");
		System.out.println("q. 프로그램 종료");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			addUser();
		}else if(select.equals("2")) {
			while(showUserSearch());
		}else if(select.equals("q")) {
			System.out.println("프로그램 종료중");
			return false;
		}else {
			printSelectErrorMessage();
		}
		
		System.out.println();
		return true;
		
	}
	
	private boolean showUserSearch() {
		String select = null;
		
		System.out.println("[사용자 조회]");
		System.out.println("1. 사용자 전체 조회");
		System.out.println("2. 이름으로 검색");
		System.out.println("b. 뒤로가기");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			showUserList();
		}else if(select.equals("2")) {
			showSearchUser();
		}else if(select.equals("b")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return false;
		}else {
			printSelectErrorMessage();
		}
		System.out.println();
		return true;
	}
	
	private void showUserList() {
		System.out.println("[사용자 전체 조회]");
		System.out.println("ID\t\tPW\t\t이름\t\t이메일");
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[0] == null) {
				continue;
			}
			System.out.println(userArray[i].getUsername() + "\t\t"
						+ userArray[i].getPassword() + "\t\t"
						+ userArray[i].getName() + "\t\t"
						+ userArray[i].getEmail());
			
		}
		System.out.println("등록된 사용자가 없습니다.");
		
	}
	
	private void showSearchUser() {
		String searchName = null;
		
		System.out.println("[학생 이름으로 검색]");
		System.out.println("이름 >> ");
		searchName = scanner.nextLine();
		
		User showSearchUser = searchUserByUserName(searchName);
		
		
	}
	
	private User searchUserByUserName(String searchName) {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				String userName = userArray[i].getName();
				if(searchName.equals(userName)) {
					return userArray[i];
				}
			}
		}
		System.out.println("해당 이름의 사용자는 존재하지 않습니다.");
		return null;
	}
	
	
	public User addUser() {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				continue;
			}
			userArray[i] = inputUser();
			System.out.println("[ " + userArray[i].getName() + " ] 님의 사용자 등록이 완료되었습니다.");
			return userArray[i];
		}
		System.out.println("더 이상 사용자를 등록할 수 없습니다.");
		return null;
	}
	
	private User inputUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("[사용자 등록]");
		
		System.out.print("ID : ");
		username = scanner.nextLine();
		
		System.out.print("PW : ");
		password = scanner.nextLine();
		
		System.out.print("이름 : ");
		name = scanner.nextLine();
		
		System.out.print("이메일 : ");
		email = scanner.nextLine();
		
		return new User(username, password, name, email);
	}
	

}
