package j05_입력;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
		/*
		 * 이름을 입력해 주세요: (여려명 입력 가능)
		 *   ㄴ names = 김준일 강민지 박진관 오유리 조문기 (띄어쓰기로 받음) > nextLine
		 * phones = 9988 1916, 1234 5678, 1111 2222,  (여러개 입력, 띄어쓰기로 구분) > nextLine 
		 * 
		 * ***님, ***님, ***님으로 출력
		 * 
		 * 010-9988-1926 / 010-1234-5678 / 010-1111-2222 으로 출력
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String names = null;
		String phones = null;
		
		System.out.print("이름을 입력해 주세요: ");
		names = scanner.nextLine();
		
		System.out.print("연락처를 입력해 주세요: ");
		phones = scanner.nextLine();
		
		String replacenames = names.replaceAll(" ", "님, ");
		String replacephones = phones.replaceAll(", ", "/010-")
				.replaceAll(" ", "-");
		/*
		 * names = names.replaceAll(" ", "님, ") + "님";
		 * phones = "010-" + phones.replaceAll(", ", "/010-")
		 * 			.replaceAll(" ","-");
		 */
	
		
		System.out.println(replacenames + "님");
		System.out.println("010-" + replacephones);		
		
		
	}

}
