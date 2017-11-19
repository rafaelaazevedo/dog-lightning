package azevedorafaela.cucumbermaven.support;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtil {

	private ChromeDriver driver;
	private String baseURl;
	private String user;
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBaseURl() {
		return baseURl;
	}

	public void setBaseURl(String baseURl) {
		this.baseURl = baseURl;
	}

	public ChromeDriver getDriver() {
		return driver;
	}

	public void setDriver(ChromeDriver driver) {
		this.driver = driver;
	}
}
