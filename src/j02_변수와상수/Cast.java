package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = '가';
		int b = a;
		double c = b; // 업캐스팅
		
		System.out.println(b); // 유니코드 값 출력
		System.out.println(c);
		
		int d = (int) c; // 다운캐스팅 > 형 변환하고자 하는 타입을 괄호에 기입
		char e = (char) d;
		
		// char는 int로만 가능하고 바로 double로 형변환 불가능
		
		System.out.println(d);
		System.out.println(e);
	}

}
