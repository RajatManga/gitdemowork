import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Btest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		System.setProperty("webdriver.chrome.driver",projectpath+"/Drivers/ChromeDriver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://seleniumhq.org/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		d.close();


	}

}
