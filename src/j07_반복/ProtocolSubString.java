package j07_반복;

public class ProtocolSubString {
	
	/*
	 * @ 뒤에 오는 문자열이 명령어
	 * : 뒤에 오는 문자열은 내용
	 */
	
	public static void main(String[] args) {
		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendData:2022/07/21";
//		String message = null;
//		String to = null;
//		String from = null;
//		String sendData = null;
		
		while(true) {
			int commandIndex = data.indexOf("@") + 1; // if에서 명령어와 같은지 조건을 걸기 위해 명령어의 인덱스(위치)를 찾음 > @+1 인덱스부터
			int contentIndex = data.indexOf(":"); // 내용의 시작점의 인덱스(위치)를 찾음
			int nextCommandIndex = data.indexOf("@", 1); // **1**번부자리부터 @를 찾음(다음 골뱅이를 찾기위해 1입력 필수) > ***마지막 명령어에는 다음 @가 없어 결과값이 -1이 나오게 됨*** 
			
			String command = data.substring(commandIndex, contentIndex); // 명령어. @다음부터 :전까지
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex) // 메시지 내용. :다음부터 다음 골뱅이 앞까지 출력
					: data.substring(contentIndex + 1); 
					// 마지막에는 @가 없어 -1이 출력됨 > 3항연산자 사용 > -1이 아니면 :부터 다음 골뱅이 앞까지, -1이면 :다음부터 끝까지 출력
			
//			System.out.println(command);
//			System.out.println(content);
			
//			if(command.equals("Message")) {
//				message = content;
//			}else if(command.equals("To")) {
//				to = content;
//			}else if(command.equals("From")) {
//				from = content;
//			}else if(command.equals("SendData")) {
//				sendData = content;
//			}
//			
			System.out.println(command + ": " + content); // if문 축약 > 데이터가 추가되어 else if를 추가하지 않고도 알아서 출력가능
			
			if(nextCommandIndex == -1) {
				break;				
			}
			
			data = data.substring(nextCommandIndex); // 앞의 내용을 삭제하기 위해 data에 다음 @ 뒤의 내용을 다시 저장함
		}
		
//		System.out.println();
//		System.out.println("Message: " + message);
//		System.out.println("To: " + to);
//		System.out.println("From: " + from);
//		System.out.println("SendData: " + sendData);
	}

}
