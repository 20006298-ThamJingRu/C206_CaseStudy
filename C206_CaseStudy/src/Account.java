
public class Account {
	private String username;
	public String password;
	private String user;
	
	public Account(String username, String password, String user) {
		this.username = username;
		this.password = password;
		this.user = user;
	}


	public void setUser(String user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUser() {
		return user;
	}
	
	
	

}
