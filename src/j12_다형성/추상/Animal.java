package j12_다형성.추상;

/*
 * 추상
 *  - 추상 메소드가 하나라도 포함되어 있는 클래스는 무조건 추상 클래스로 정의해야 한다.
 */

public abstract class Animal { // 아래 추상 메소드를 정의했는데 추상 클래스로 정의되어있지 않는다면 오류
	
	// abstractMethod(추상 메소드)
	public abstract void move();

}
