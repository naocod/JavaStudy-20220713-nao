package j11_상속;

public class Human extends Animal {
	
	public Human() {
		super(); // 부모의 주소를 의미하며 생략되어있음. 
		System.out.println("Human 객체 생성");
	}
	
	//오버라이드: 재정의
	@Override //어노테이션(@) 오버라이드
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
