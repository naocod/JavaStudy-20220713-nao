package j07_반복;

public class Continue2 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 ==0) {
				continue; // continue 밑의 실행문은 무시되고 다음 반복문으로 넘어간다.
			}
			System.out.println("i: " + i);
		}
	}

}
