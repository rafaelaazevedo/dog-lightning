package azevedorafaela.cucumbermaven.support;

import com.google.inject.Inject;


public abstract class Support {

	@Inject
	private DriverFactory driverFactory;

	public void loadBaseUrl(String url) {
		driverFactory.getDriver().get(url);
	};

}
