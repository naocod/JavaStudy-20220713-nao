package j07_반복;


public class For4 {

	public static void main(String[] args) {
		
		
		String address = "부산 동래구 사직동 중앙대로";
		
		for(int i = 0; i < address.length(); i++) {
			String subStr = address.substring(i, i + 1);
			if(subStr.equals(" ")) { // 위에서 하나씩 자른 문자중에서 .equals의 조건 문자열과 비료함
				int index = 0;
				String temp = address.substring(0, i);
				if(temp.contains(" ")) { // 문자열 중에서 조건 문자열이 포함되어 있으면 > true
					
				}
				index = temp.lastIndexOf(" ") + 1; // 뒤에서부터 조건 문자열을 찾음 > 뒤에서부터 잘라서 동부터 시작함
				System.out.println(temp.substring(index, i)); // index부터 i전까지 자름
			}else {
				System.out.println(temp.substring(0, i));
			}
			
		}
		if(i == address.length() - 1) {
			System.out.println(address.substring(address.lastIndexOf(" ") + 1));
		}
		
	}

}
