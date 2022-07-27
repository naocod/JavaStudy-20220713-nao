package j12_다형성.factory;

import j11_상속.factory.Factory;

public class FactoryService { // 결합도는 낮고 응집도는 높은 프로그램이 좋은 프로그램
	
	private Factory factory;
	
	public FactoryService(Factory factory) {
		this.factory = factory;
	}
	
	public void factoryStart() {
		factory.start();
	}
	
	public void factoryStop() {
		factory.stop();
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	
	

}
