package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {
		
		// 업캐스팅 > 부모 객체를 자식이 사용가능
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsumgFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsumgFactory(1);
		factories[3] = new LGFactory(1);
						
				
		// 다운캐스팅
		
		//  - instanceof : 객체의 원래 형태를 비교
		
		System.out.println(factories[0] instanceof SamsumgFactory);
		
		for(int i = 0; i < factories.length; i++) {
			
			if(factories[i] instanceof SamsumgFactory) {
				SamsumgFactory samsumgFactory = (SamsumgFactory) factories[i];
				samsumgFactory.produceSmartPhone();
				
			}else if(factories[i] instanceof LGFactory) {
				LGFactory lgFactory = (LGFactory) factories[i];
				lgFactory.produceSmartTv();

			}else {
				System.out.println("형변환 불가");
			}
		}
	}

}
