package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

@NoArgsConstructor	// 기본생성자
@AllArgsConstructor	// 전체생성자
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
@Data // 위에 4개를 묶어서 사용
public class Student {
	private int studentCode;
	private String name;
	private int studentYear;
	private int age;
	
	

}
