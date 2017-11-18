package com.framework.dataproviders;

import static java.util.Arrays.asList;

import org.openqa.selenium.Dimension;
import org.testng.annotations.DataProvider;

public class GalenWindowSizeDataProvider {

	@DataProvider(name = "devices")
	public Object[][] windowSizeInfo() {
		return new Object[][] { { new Dimension(450, 800), asList("mobile") } };
	}

}
