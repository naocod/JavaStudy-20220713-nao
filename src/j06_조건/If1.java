package j06_조건;

public class If1 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작\n");
		
		boolean breakfast = true;
		boolean academy = true;
		
		if(breakfast) { // 조건문에 대한 명령문이 하나일 때 괄호 생략가능
			System.out.println("밥을 차려 먹는다.");
		}else {
			System.out.println("밥을 차려 먹지 않는다.");
		}
		if(academy) {
			System.out.println("가방을 챙긴다.");
		}
		if(!academy) {
			System.out.println("가방을 챙기지 않는다.");
		}
		
		System.out.println("\n프로그램 종료");
		
		
		
	}

}
