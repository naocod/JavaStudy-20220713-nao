package j13_최상위클래스;

public class Test extends Object { // 모든 클래스는 Object 클래스를 상속받음 (기본값 > 생략) >> 모든 객체의 상위 클래스
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void testMethod() {
		System.out.println("테스트 메소드");
	}
}
