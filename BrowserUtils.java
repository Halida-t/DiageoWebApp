package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

	Alert alert;
	WebDriverWait letswait;
	Select letsSelect;
	Actions act;
	
	
	// this method returns true when given element is found
	// returns false when given element is not found
	public boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
		} catch (NoSuchElementException e) {
		return false;
		}
		return true;
	}

	// switches the driver focus to the alert if present
	public void switchToAlert() {
		alert = driver.getDriver().switchTo().alert();
	}

	// gets the text on the alert and returns as a string
	public String alertGetText() {
		return alert.getText();
	}

	public void alertAccept() {
		alert.accept();
	}

	public void alertDismiss() {
		alert.dismiss();
	}

	public void sendKeysOnAlert(String name) {
		alert.sendKeys(name);
	}

	// this method waits for an Alert to be present
	public void waitUntilAlertIsPresent() {
		letswait = new WebDriverWait(driver.getDriver(), 10);
		letswait.until(ExpectedConditions.alertIsPresent());
	}

	// this method waits the given element to be visible on the page
	public void waitUntilElementVisible(WebElement element) {
		letswait = new WebDriverWait(driver.getDriver(), 10);
		letswait.until(ExpectedConditions.visibilityOf(element));
	}

	// this method waits the given element to be clickable
	public void waitUntilElementClickable(WebElement button) {
		letswait = new WebDriverWait(driver.getDriver(), 10);
		letswait.until(ExpectedConditions.elementToBeClickable(button));
	}

	// this method selects from a dropdown by visible text
	public void selectByVisibleText(WebElement element, String optionToSelect) {
		letsSelect = new Select(element);
		letsSelect.selectByVisibleText(optionToSelect);
	}

	// this method selects from a dropdown by index
	public void selectByIndex(WebElement element, int indexTobeSelected) {
		letsSelect = new Select(element);
		letsSelect.selectByIndex(indexTobeSelected);
	}

	// this method selects from a dropdown by value
	public void selectByValue(WebElement element, String valueTobeSelected) {
		letsSelect = new Select(element);
		letsSelect.selectByValue(valueTobeSelected);
	}

	// hoverover to an element
	public void hoverOverToElement(WebElement element) {
		act = new Actions(driver.getDriver());
		act.moveToElement(element).perform();
	}

	// drag the source element to the target element
	public void dragAndDrop(WebElement sourceElement, WebElement tagtetElement) {
		act = new Actions(driver.getDriver());
		act.dragAndDrop(sourceElement, tagtetElement).build().perform();
	}

	// this method is for deleting the pre-populated value of an input field with
	// back space key events
	public void clearValueOnTheField(WebElement element) {
		String temp = element.getAttribute("value");
		for (int i = 0; i < temp.length(); i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}
	}

	// this method is for deleting the pre-populated value of an input field with
	// control + a keys event for windows
	public void clearTextOfTheField(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL), "a");
		element.sendKeys(Keys.DELETE);
	}
}

