package j03_연산자;

public class Operation2 {

	/*
	 * 논리연산
	 * 
	 * AND 연산(&&) > 곱
	 *  - true && true => true
	 *  - true && false => false
	 *  - false && false => false 
	 * 
	 * OR 연산(||) > 합
	 *  - true || true => true
	 *  - true || false => true
	 *  - false || false => false 
	 *  
	 * NOT 연산(!) > 부정
	 *  - !true => false
	 *  - !false => true
	 * 
	 *  - !(true && false) => true
	 *  
	 */
	
	
	public static void main(String[] args) {
		boolean result = 10 > 5;
		boolean result2 = 10 == 10;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println("" + result + result2);
		
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0 && 2000 % 5 ==0 );
		//						true	 &&		false		&&		true
		
	}

}
