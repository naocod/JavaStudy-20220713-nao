package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class UserArrayList2 {
	
	private List<User> userList;
	private Scanner scanner;
	
	
	public UserArrayList2() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	
	public void addUser() {
		
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		
		System.out.print("이름: ");
		name = scanner.nextLine();
		
		System.out.print("이메일: ");
		email = scanner.nextLine();
		
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		
		userList.add(user);
	}
	
	public void printUser() {
		
		for(User user : userList) {
			System.out.println("아이디\t> " + user.getUsername());
			System.out.println("비밀번호\t> " + user.getPassword());
			System.out.println("이름\t> " + user.getName());
			System.out.println("이메일\t> " + user.getEmail());
			System.out.println();
		}
		
	}
	
	public void removeUser() {
		
		String username = null;
		String password = null;
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		
		for(User user : userList) {
			
			if(user.getUsername().equals(username)) {
				System.out.print("비밀번호: ");
				 password = scanner.nextLine();
				
				if(user.getPassword().equals(password)) {
					userList.remove(user);
					
					System.out.println(user.getName() + "에 대한 정보 삭제 완료");
					return;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					return;
				}
				
			}
		}
		System.out.println("일치하는 아이디가 없습니다.");
		
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * [ 사용자 관리 프로그램 ]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력
		 * 3. 사용자 삭제
		 * q. 프로그램 종료
		 */
		
		UserArrayList2 userArrayList2 = new UserArrayList2();
		
		
		while(true) {
			
			String select = null;
			
			System.out.println("[ 사용자 관리 프로그램 ]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.print("메뉴 선택 > ");
			
			select = userArrayList2.scanner.nextLine();
			
			if(select.equals("1")) {
				userArrayList2.addUser();
			}else if(select.equals("2")) {
				userArrayList2.printUser();
			}else if(select.equals("3")) {
				userArrayList2.removeUser();
			}else if(select.equals("q")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("선택할 수 없는 메뉴입니다.");
			}
		}
		
		
		
	}
	
	
	
	
	
}
