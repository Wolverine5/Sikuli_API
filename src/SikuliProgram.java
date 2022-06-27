import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliProgram {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		Screen screen =new Screen();
		
		Pattern img1= new Pattern("C:\\Users\\ASUS\\Pictures\\Selenium\\Capture1.png");
		Pattern img2= new Pattern("C:\\Users\\ASUS\\Pictures\\Selenium\\Capture2.png");
		
		
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Drivers\\chromedriver_win32 (100)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.zamzar.com/");
        Thread.sleep(5000);
        
        
        //Xpath of "choose file" button
        driver.findElement(By.xpath("//*[@id='step-1']/div[2]/button[1]")).click();
        
        screen.wait(img1,10);   //double argument
        
        screen.type(img1, "C:\\Users\\ASUS\\Pictures\\Screenshots\\Screenshot (174)");  //pattern,string
        
        screen.click(img2);
		
		
		
		

	}

}
