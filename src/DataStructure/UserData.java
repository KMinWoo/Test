package DataStructure;

public class UserData {

	private String userID;
	private String userPassword;
	private String userName;

	public UserData() {
		this.userID = null;
		this.userPassword = null;
		this.userName = null;
	}

	public UserData(String id, String password, String name) {
		this.userID = id;
		this.userPassword = password;
		this.userName = name;
	}

}
