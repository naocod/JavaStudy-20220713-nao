package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@NoArgsConstructor
//@Required0ArgsConstructor // final을달아주고 nonNull
//@AllArgsConstructor // AllArgs를 사용하면 Require 잘 안씀
public class User {
	

	private String email;
	private String name;
	@NonNull
	private String username;
	@NonNull
	private String password;
	
//	public User(String username, String password) {
//		this.username = username;
//		this.password = password;
//		
//	}

}
