package Phase_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubscribeCourse {

	By btnLogin = By.xpath("//a[@class='btn btn-quaternary ng-binding']");
    By btnSubmit = By.xpath("//button[@class='btn btn-primary mb10 ng-binding']");
    By search = By.id("q");
    By btnsearch = By.xpath("//button[@class='fa fa-search c_quick-search__btn']");
    //By img = By.xpath("https://medu.vn:3000/upload/root/2019/1/12/a1ed18d5-43f8-43a6-b066-b0902bbc38ec.jpg");
    By img2 = By.xpath("//img[@src='https://medu.vn:3000/upload/nguyenngoctung/2019/1/14/bf6cf9de-5951-441d-b1f4-4dc53a158c68.jpg']");
    By btnsubscribe = By.xpath("//button[@ng-click='$parent.enroll(currentCourse)']");
    By btnsubsuccess = By.xpath("//button[@class='success-lead-action btn btn-primary "
    		+ "btn-block ng-binding']");
    
    public void Subscribe() throws InterruptedException{
    	WebDriver driver = new FirefoxDriver();
		driver.get("https://medu.vn/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(btnLogin).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("buixuyen1010.94@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(btnSubmit).click();
		Thread.sleep(1000);
		
		driver.findElement(search).sendKeys("QUẢN LÝ CHẤT LƯỢNG");
		driver.findElement(btnsearch).click();
		
		Thread.sleep(1000);
		//driver.findElement(img).click();			
		//Thread.sleep(1000);
		driver.findElement(img2).click();			
		Thread.sleep(1000);
		driver.findElement(btnsubscribe).click();
		Thread.sleep(1000);
		System.out.println("Chúc mừng Bạn đã đăng ký thành công");
		//driver.findElement(btnsubsuccess).click();
		
//		try{
//			Thread.sleep(1000);
//			driver.findElement(img).click();			
//			
//			driver.findElement(btnsubscribe).click();
//			driver.findElement(btnsubsuccess).click();
//		
//			}catch(InterruptedException ie){
//			System.out.println("x");
//			}
    }
    
    public static void main(String[] args) throws InterruptedException{
    	new SubscribeCourse().Subscribe();
    }
}
