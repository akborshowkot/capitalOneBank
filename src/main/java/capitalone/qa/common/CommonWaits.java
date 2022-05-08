package capitalone.qa.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.util.Assert;

import capitalone.qa.base.BaseClass;

public class CommonWaits {
	public void waitUntilClickable(WebElement element) {
		try {
			BaseClass.wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (NullPointerException e) {
			System.out.println(element + " : Not Found");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void waitUntilVisible(WebElement element) {
		try {
			BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
		} catch (NullPointerException e) {
			System.out.println(element + " : Not Found");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void waitUntilSelectable(WebElement element) {
		try {
			BaseClass.wait.until(ExpectedConditions.elementToBeSelected(element));
		} catch (NullPointerException e) {
			System.out.println(element + " : Not Found");
			e.printStackTrace();
			Assert.fail();
		}
	}
	
}
