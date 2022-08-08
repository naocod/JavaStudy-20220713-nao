package j19_익명클래스.람다식;

@FunctionalInterface
public interface Math<T1, T2> {
	public double calc(T1 value1, T2 value2); // double 형태의 clac 변수 생성
//	public double calc2(T1 value1, T2 value2); 
}
