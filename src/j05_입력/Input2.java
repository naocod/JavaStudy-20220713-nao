package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		/*
		 * Scanner
		 * 이름: 김준일			next()		name
		 * 나이: 29				nextInt()	age
		 * 주소: 부산 동래구 사직동	nextLine()	address
		 * 연락처: 010-9988-1916	next()		phone
		 *
		 * 사용자의 이름은 김준일이고 나이는 29살입니다.
		 * 주소는 부산 동래구 사직동에 거주중입니다.
		 * 연락처는 010-9988-1916입니다.
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		
		String name = null;
		int age = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름: ");
		name = scanner.next(); // 버퍼에 space와 enter키는 무시되지만 문자열은 변수에 대입되고 엔터는 남아있음(nextLine 제외)
		
		System.out.print("나이: ");
		age = scanner.nextInt(); // 버퍼에 엔터가 남아있음
		scanner.nextLine(); // 비어있는 nextLine을 입력함으로써 남아있는 엔터를 초기화시켜 문제 해결
		
		System.out.print("주소: ");
		address = scanner.nextLine(); // 버퍼에 엔터가 남아있어 입력이 종료되어 입력할 수 없음
		// nextLine > 엔터를 포함하기에 초기화하지 않아도됨
		
		System.out.print("연락처: ");
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "살입니다.");
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " + phone + "입니다.");
		
	}

}
