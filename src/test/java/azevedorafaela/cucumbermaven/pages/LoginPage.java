package azevedorafaela.cucumbermaven.pages;


import com.google.inject.Inject;

import azevedorafaela.cucumbermaven.support.Support;

public class LoginPage {
	
	@Inject
    private Support support;
    
	public void getLoginUrl() throws Throwable {
		support.loadBaseUrl("https://google.com");
	}

}
