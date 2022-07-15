package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		// System.out.println("\"안녕하세요.\"");
		
		
		String address = "부산시 동래구 사직동";
		int index = address.lastIndexOf("동") ; // .을 찍으면 기능들이 나옴 > String이라는 클래스의 기능들 때문
		// .indexOf 찾고자하는 것의 위치를 반환함
		// .lastIndexOf 찾고자하는 것의 위치를 뒤에서부터 찾아서 반환함
		// 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
		System.out.println(index);
		
		// 해당 문자열에서 범위를 지정하여 문자열을 잘라줌 
		String subAddress = address.substring(1, 5); // 0부터 5전까지 0~4까지 출력됨 0 ~ < 5
		// .substring 
		System.out.println(subAddress);
		
		
		int index1 = address.indexOf("동");
		int index2 = address.lastIndexOf("동");

		String address2 = address.substring(index1); // 중간에서 값을 추출한다면 끝의 위치를 지정해줘야하지만 상관없이 끝까지 출력할경우 끝을 지정하지 않아도됨
		String address3 = address.substring(address.indexOf("동")); // 중간에서 값을 추출한다면 끝의 위치를 지정해줘야하지만 상관없이 끝까지 출력할경우 끝을 지정하지 않아도됨
		
		System.out.println(address2);
		System.out.println(address3);
		
		// 해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능 <replace>
		String replaceAddress = address.replace(' ', '-'); // char, char
		System.out.println(replaceAddress);
		
		replaceAddress.replaceAll(" ", "-"); // String, String
		System.out.println(replaceAddress);
		
		
		String phoneNumbers = "010/9988/1916, 010/1234/5678"; // 조건: / > -, 010 > 011, , > /, 공백 x, 
		String rePhone = phoneNumbers.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/","-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(",","/");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(" ","");
		System.out.println(rePhone);
				
		String rePhone2 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/","-")
				.replaceAll(",","/")
				.replaceAll(" ","");
		System.out.println(rePhone2);
				
	}

}
