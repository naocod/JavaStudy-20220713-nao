package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		
		// 업캐스팅 > 부모 객체를 자식이 사용가능
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsumgFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsumgFactory(1);
		factories[3] = new LGFactory(1);
						
				
		int num = 10;
		double dNum = (double) num; // double 생략가능 > (업캐스팅) 묵시적 형변환
		
		System.out.println(dNum);
		
		int n = (int) dNum; // 생략 불가능 > (다운캐스팅) 명시적 형변환
		
		
		double d = 3.14; // Factory
		int i = (int) d; // Factory -> SamsungFactory
		
		SamsumgFactory sFactory = new SamsumgFactory(1);
		Factory f = (Factory) sFactory;
		
		System.out.println(f);
		
//		SamsumgFactory sf = (SamsumgFactory) f;
		
//		Factory factory = new Factory(1);
//		SamsumgFactory samsumgFactory = (SamsumgFactory) factory; // 업캐스팅된 상태에서만 다운캐스팅이 가능함
	}

}
