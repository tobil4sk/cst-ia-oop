package supo.week3;

public class Settings {
	// the singleton instance
	private static Settings instance;
	
	// static method which provides access to the singleton instance
	public static Settings getInstance() {
		if (instance == null) {
			instance = new Settings();
		}
		return instance;
	}
	
	// constructor is private, so it can only be instantiated within the class.
	private Settings() {}
	
	private String userName = "default-user";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
