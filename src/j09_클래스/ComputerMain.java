package j09_클래스;

public class ComputerMain {

	public static void main(String[] args) {
//		System.out.println(new Computer()); // j09_클래스.Computer@6f2b958e > 패키지명.클래스명@주소값(바뀜)
//		System.out.println(new Computer());
		
		Computer c1 = new Computer(); // 스캐너와 마찬가지로 Computer 자료형의 변수를 생성함
		// 생성 > 메모리르 할당받음=>주소를 받음
		// 주소값을 항상 기억할 수 없기에 c1과 같은 변수에 저장함
		
		Computer c2 = new Computer();
		
		c1.cpu = "i7";
		// c1에 저장된 주소값의 cpu 변수에 i7저장
		c1.company = "SAMSUNG";
		// c1에 저장된 주소 참조해서 변수에 접근
		c1.ram = 8;
		c1.year = 2022;
		c1.graphic = "RTX3060";
		
		c2.cpu = "i5";
		c2.company = "LG";
		c2.ram = 16;
		c2.year = 2021;
		c2.graphic = "GTX1080";
		
		c1.showInfo();
		System.out.println();
		c2.showInfo();
		
		System.out.println();
		c1.addRam(20);
		c1.showInfo();
		
		System.out.println();
		c2.removeRam(15);
		c2.showInfo();
		c2.removeRam(2);
		
		
		/*
		 * 생성 > new로 빌려서 생성자 호출
		 * 반환해야함 > 소멸
		 * 
		 */
		
		/*
		 * 지정되어서 늘어날 수 없는 공간 > 스택
		 * 스택영역을 할당받음(정적할당) > 스택 이상의 데이터 프로그램을 저장할 수 없기에 힙에서 빌려서 저장함 (동적할당) => New로 할당받음
		 * 쓰레기 > 사용하지 않는 데이터
		 * 클래스로 힙영역을 빌렸지만 사용하지 않아 가비지컬렉터가 반납시켜줌
		 * 메모리의 힙영역을 빌려서 소멸하지 않으면 메모리가 꽉차서 다른 프로그램을 실행시킬 수 없음
		 * 
		 * . > (주소)참조, 주소를 찾아가는 행위
		 */
	}

}
