package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		
		int index = 0;
		String names = "김준일님, 서재효님, 임나영님, 문창배님, 전나경님";
		
		// 김준일/서재효/임나영/문창배/전나경
		
		StringBuilder stringBuilder = new StringBuilder();
		index = names.indexOf("님"); // index + 1 붙여도 가능
		stringBuilder.append(names.substring(index-3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index-3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index-3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index-3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index-3, index));
		// substring 뒤에 + "/" 하여도 되지만 따로 쓰는것이 성능상 이점이 있음
		
		
		System.out.println(stringBuilder.toString());
		System.out.println();
		
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3); // 3번 인덱스부터 9번 인덱스 전까지 삭제
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		System.out.println(stringBuilder2.toString());

		
	}

}
