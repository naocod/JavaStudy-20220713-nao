package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("이름: ");
		stringBuilder.append("김준일"); //버퍼와 같은개념
		stringBuilder.delete(1, 2); // 이 / 름 / : /  / 김 / 준 / 일 => 름삭제 1부터 2앞까지
		
		System.out.println(stringBuilder.toString() );
		
	}

}
