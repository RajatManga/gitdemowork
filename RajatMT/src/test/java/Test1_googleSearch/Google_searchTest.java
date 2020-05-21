package Test1_googleSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageobject;

public class Google_searchTest {
	static WebDriver d = null;
	public static void main(String[] args) {
		
		google_search();
	}
	public static void google_search() {
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/Drivers/ChromeDriver/chromedriver.exe");
		d = new ChromeDriver();
		GoogleSearchPageobject Srcobject = new GoogleSearchPageobject(d);
		d.get("https://www.google.com/");
		Srcobject.setTextSearchbox("Rajat Manga");
		
	}

}
