package j15_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	
	public static int autoCode = 2022000;
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = ++autoCode;
		this.name = name;
	}
}
