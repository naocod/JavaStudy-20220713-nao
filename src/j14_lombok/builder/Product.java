package j14_lombok.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	
	private int productCode;		// 제품코드		: 20220802
	private String productName;		// 제품명			: 스타벅스 텀블러
	private String productCategory;	// 제품 카테고리	: 텀블러
	private String createDate;		// 생산일자		" 2022-08-02		

}
