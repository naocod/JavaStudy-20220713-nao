package j12_다형성.추상;

public class Human extends Animal{
	
	@Override
	public void move() { // 오버라이드를 하지 않으면 추상메소드를 그대로 받아오기 때문에 추상 클래스로 정의해줘야함
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
 