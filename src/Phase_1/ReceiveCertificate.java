package Phase_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReceiveCertificate {

	By btnLogin = By.xpath("//a[@class='btn btn-quaternary ng-binding']");
    By btnSubmit = By.xpath("//button[@class='btn btn-primary mb10 ng-binding']");
    By btnCourseLearning = By.xpath("//div//a[@target='_self']");
    By course = By.xpath("//div[@class='card__details']");
    By img = By.xpath("//img[@src='https://www.medu.vn/"
    		+ "/2018/12/24/cede4726-6cc1-42f1-8d28-6d484a438de5.jpg']");
    By search = By.id("q");
    By btnsearch = By.xpath("//button[@class='fa fa-search c_quick-search__btn']");
    By btncoursepage = By.xpath("//a//span[contains(@class,'ng-binding') and "
    		+ "contains(text(), 'Trang khóa học')]");
    
	By certificate = By.xpath("//div[@class='progress']");
	//By btndownload = By.xpath("//button[@ng-click='download()']");
	
	public void Receive () throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.medu.vn/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(btnLogin).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("buixuyen1010.94@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(btnSubmit).click();
		Thread.sleep(1000);
		driver.findElement(btnCourseLearning).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(course).click();	
		
		Thread.sleep(1000);
		driver.findElement(certificate).click();
		Thread.sleep(2000);
		//driver.findElement(btndownload).click();
		System.out.println("Nhận chứng chỉ thành công");
	}
	
	public static void main(String[] mains) throws InterruptedException{
		new ReceiveCertificate().Receive();
	}
}

