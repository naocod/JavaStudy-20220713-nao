package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<K, V> { // T > type(모든타입 자료형), E > elements(객체유형) / type이 상위
	private K key;
	private V value;
	

}
