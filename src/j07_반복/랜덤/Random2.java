package j07_반복.랜덤;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		/*
		 *  < Random 클래스>
		 * - nextBoolean()
		 * - nextInt()
		 * ...
		 */
		
		Random random = new Random();
		
		
//		int i = 0;
//		int temp = 0;
//		
//		while(i < 10) {
//			int rNum = random.nextInt(10);
//			System.out.println("현재 temp 값: " + temp);
//			System.out.println("새로 생성된 값: " + rNum);
//			System.out.println();
//			
//			if(i == 0) {
//				temp = rNum;
//			}else {
//				if(temp < rNum) {
//					temp = rNum;
//				}
//			}
//			
//			
//			i++;
//		}
//
//		
//		System.out.println("최대값: " + temp);
		
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		while(i < 20) {
			a = random.nextInt(50); // 0 ~ 49까지의 랜덤 수 
			b = random.nextInt(50);
			c = random.nextInt(50);
			
			System.out.println(i + 1 + "번");
			System.out.println("a값: " + a);
			System.out.println("b값: " + b);
			System.out.println("c값: " + c);
			System.out.println();
			
			if(a > b && max < a) {
				max = a;
//				if(max < a) { => a > b && max < a
//					max = a;
//				}
			}else if(max < b) {
					max = b;
				}
			
			if(max < c) { // if가 별도로 존재해야함 > c는 무조건 실행되어야하기 때문 else로 묶여버리면 안됨
				max = c; // if와 else if로 a와 b가 max보다 큰지 비교하여 둘 다 실행되지 않았을 때 c가 무조건 실행되어야하기 때문에 if로 빠짐
			}
			
			
			i++;
		}
		
		System.out.println("최대값: "  + max);
		
	}

}
