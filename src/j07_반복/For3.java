package j07_반복;


public class For3 {

	public static void main(String[] args) {
		
		/*
		 * str = abcdefghijk
		 * 
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 */
		
		String str = "abcdefghijk";
		
		for(int i = 0; i < str.length(); i++) { // .length() > 문자열의 길이를 반환함
			String subStr = str.substring(i, i + 1);
			System.out.println(subStr);
		}
		
	}

}
