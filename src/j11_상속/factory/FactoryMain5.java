package j11_상속.factory;

public class FactoryMain5 {

	public static void main(String[] args) {
		
		/*
		 * Factory Array 20
		 * 
		 * 배열의 인덱스가 
		 * 짝수이면 SamsungFactory 생성해서 대입
		 * 홀수이면 LGFactory 생성해서 대입
		 * 
		 * 삼성공장 1 ~ 10
		 * LG공장 1 ~ 10
		 * 
		 * -하나의 for문
		 * 모든 공장 가동
		 * 
		 * 모든 공장 생산
		 * 
		 * 모든 공장 중지
		 * 
		 */

		
		Factory[] factories = new Factory[20];
		
		
		for(int i = 0; i < factories.length; i++) {
			
			if(i % 2 == 0)  {
				factories[i] = new SamsumgFactory(i / 2 + 1); // i가 0,1 > 1 | 2,3 > 2 | 4,5 > 3 ...
				
			}else {
				factories[i] = new LGFactory(i / 2 + 1); 
			}
			
		}
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
			if(factories[i] instanceof SamsumgFactory) {
				((SamsumgFactory) factories[i]).produceSmartPhone(); // SamsumgFactory로 다운캐스팅
			}else {
				((LGFactory) factories[i]).produceSmartTv(); // LGFactory로 다운캐스팅
			}
			factories[i].stop();
			System.out.println();
		}
	}

}
