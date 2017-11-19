package azevedorafaela.cucumbermaven.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Support extends BaseUtil {
	BaseUtil base;

	public Support(BaseUtil base) {
		this.base = base;
	}

	public WebElement findElementByName(String element) {
		return base.getDriver().findElement(By.name(element));
	};
	public void loadBaseUrl(){
		base.getDriver().get(base.getBaseURl());
	}

}
