package j12_다형성.인터페이스.usb;

public class KeyBoard implements USB { // 키보드는 USB 기능을 가질 수 있음

	@Override
	public void connect() {
		System.out.println("키보드를 연결합니다.");
	}

	@Override
	public void disconnect() {
		System.out.println("키보드 연결을 해제합니다.");
	}
	

}
