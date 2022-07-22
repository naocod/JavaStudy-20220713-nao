package j09_클래스.접근지정자;

import j09_클래스.접근지정자.a.TestA_2;
import j09_클래스.접근지정자.b.TestB;

public class AccessModifierMain {

	public static void main(String[] args) {
		TestA_2 testA_2 = new TestA_2(); // 디폴트 > 같은 패키지에서만 접근가능, 하지만 생성자는 접근가능 > 기본적으로 생성자는 public이기 때문
		testA_2.testA2();
		
		TestB testB = new TestB();
		testB.getTb();
	}

}
