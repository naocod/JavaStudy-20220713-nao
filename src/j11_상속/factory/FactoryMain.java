package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		SamsumgFactory[] samsumgFactories = new SamsumgFactory[3];
		samsumgFactories[0] = new SamsumgFactory(1);
		samsumgFactories[1] = new SamsumgFactory(2);
		samsumgFactories[2] = new SamsumgFactory(3);
		
		LGFactory[] lgFactories = new LGFactory[3];
		lgFactories[0] = new LGFactory(1);
		lgFactories[1] = new LGFactory(2);
		lgFactories[2] = new LGFactory(3);
		
		for(int i = 0; i < samsumgFactories.length; i++) {
			System.out.println("삼성 공장 가동");
			samsumgFactories[i].start();
		}
		
		for(int i = 0; i < lgFactories.length; i++) {
			System.out.println("LG 공장 중지");
			lgFactories[i].stop();
		}
		
		System.out.println("---------------------");
		
		for(int i = 0; i < lgFactories.length; i++) {
			System.out.println("LG 공장 가동");
			lgFactories[i].start();
		}
		
		for(int i = 0; i < lgFactories.length; i++) {
			System.out.println("LG 공장 중지");
			lgFactories[i].stop();
		}
		
		
	}

}
