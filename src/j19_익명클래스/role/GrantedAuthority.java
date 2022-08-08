package j19_익명클래스.role;


public interface GrantedAuthority {
//	public Collection<String> getRoles(List<String> roles); // 리스트를 받아서 컬렉션을 리턴함(꼭 스트링 아니어도됩 ?가능) 
	
	public String getAuthority();
}
