package com.wundermobility.MobileAutomation_FasTip;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class base extends appium {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Scenario One - open the app and pass the tip and press the button
		driver.findElementByXPath("//android.widget.EditText[@text='Bill Amount']").sendKeys("120");
		driver.findElementById("org.traeg.fastip:id/calcTipButton").click();

		// Scenario two - Clear the tip and pass the second tip
		driver.findElementByXPath("//android.widget.EditText[@text='Bill Amount']").clear();
		driver.findElementByXPath("//android.widget.EditText[@text='Bill Amount']").sendKeys("150");
		driver.findElementByXPath("org.traeg.fastip:id/calcTipButton").click();

	}

}
