package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageobject {
	WebDriver d = null;
	
	By Google_Sreachbox = By.xpath("//input[@name='q']");
	By Search_button = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
	

	public GoogleSearchPageobject(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.d = d;

	}

	public void setTextSearchbox(String text) {
		d.findElement(Google_Sreachbox).sendKeys(text);
	}
	
	public void clickSearchbutton() {
		d.findElement(Search_button).click();
	}

}
