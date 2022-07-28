package j12_다형성.인터페이스;

/*
 * 인터페이스 특징 ( 상속x 구현o )
 *  1. 모든 메소드는 기본적으로 추상 메소드로 정의한다.
 *  2. 생성을 할 수 없다.
 *  3. 일반 변수는 선언할 수 없다.
 *  4. 무조건 스태틱 상수를 사용한다.
 *  5. 일반 메소드를 정의하기 위해서는 반환 자료형 앞에 default를 입력해야한다.
 *  6. 인터페이스는 다중 구현이 가능하다.
 *  
 *  인터페이스끼리는 상속
 *  인터페이스를 클래스에서 사용할 때는 implements(구현)
 */

public interface HDMI extends ConnectionTerminal {
	public String VERSION = "2.0"; // 인터페이스는 기본적으로 스태틱 상수를 사용함.
	
	public void soundOutput();

}

