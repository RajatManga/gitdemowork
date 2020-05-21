package Test1_googleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		G_Search();
	}

	static void G_Search() {
		System.out.println();
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/Drivers/ChromeDriver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.selenium.dev/");
		d.findElement(By.xpath("//a[contains(text(),'Downloads')]")).click();
	}
}
