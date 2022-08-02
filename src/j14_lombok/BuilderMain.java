package j14_lombok;

public class BuilderMain {
	
	public static void main(String[] args) {
		Builder builder = new Builder();
		Car car = builder.builder()
			.company("기아")
			.model("k5")
			.color("화이트")
			.build(); // .build를 해줘야지 객체가 만들어짐
		
		
		System.out.println(car);
		
		Car car2 = new Car(); // 이미 생성됨 위의 builder는 마지막에 완성시켜서 리턴함
		car2.setCompany("현대");
		car2.setColor("블랙");

	}

}
