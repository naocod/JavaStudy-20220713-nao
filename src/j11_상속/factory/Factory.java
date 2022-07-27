package j11_상속.factory;

public class Factory {
	
	private int factoryNumber;
	
	public Factory(int factoryNumber) { // 상속가능 > public은 다 상속 가능
		this.factoryNumber = factoryNumber;
	}
	
	public void start() { // 상속가능
		System.out.println(factoryNumber + "공장을 가동합니다.");
	}
	
	public void stop() { // 상속가능
		System.out.println(factoryNumber + "공장을 멈춥니다.");
	}

}
