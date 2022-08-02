package j15_스태틱.싱글톤;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Car {
	
	private int carNumber;
	private String Company;
	private String model;
	public static CarBuilder builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
