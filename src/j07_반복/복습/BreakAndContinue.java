package j07_반복.복습;

public class BreakAndContinue {
	
	public static void main(String[] args) {
		String[] strArray = new String[] {"a", "b", null, "d", "e", null, "g"};
		
//		for(int i = 0; i < strArray.length; i++) {
//			if(strArray[i] == null) {
//				continue;
//			}
			
		for(int i = 0; i < strArray.length; i++) {
//			char a = strArray[0].charAt(0);
			if(strArray[i] == null) {
				strArray[i] = Character.toString((char) ('a' + i));
			}	

			System.out.println("i: " + i + " -> " + strArray[i]);
			
//			for(String s : strArray) {
//				System.out.println(s);
//			}
			
		}
		
	}

}
