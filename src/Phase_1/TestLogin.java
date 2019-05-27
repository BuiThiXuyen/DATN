package Phase_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLogin {
	
	By btnLogin = By.xpath("//a[@class='btn btn-quaternary ng-binding']"); // định nghĩa element button login trên header
    By btnSubmit = By.xpath("//button[@class='btn btn-primary mb10 ng-binding']"); // định nghĩa element button Đăng nhập

	public void Login(String email, String password) throws InterruptedException{
		WebDriver driver = new FirefoxDriver(); // định nghĩa trình duyệt test
		driver.get("https://medu.vn/"); // lấy url trang web cần test
		driver.manage().window().maximize();
		driver.findElement(btnLogin).click(); // Thực hiện hành động click button login
		
		//Case 1: Check trường hợp để trống trường email
		System.out.println("Đăng nhập để trồng trường email");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(""); //
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		System.out.println("actual result: button Đăng nhập bị disable");
		System.out.println("---------------------------------------------");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Đăng nhập để trồng trường password");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		System.out.println("actual result: button Đăng nhập bị disable");
		System.out.println("---------------------------------------------");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Đăng nhập với email sai định dạng");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email.substring(0, 10));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		System.out.println("actual result: button Đăng nhập bị disable");
		System.out.println("---------------------------------------------");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Đăng nhập password sai");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password+"7");
		driver.findElement(btnSubmit).click();
		System.out.println("actual result: hiển thị message Thông tin đăng nhập chưa đúng. Hãy nhập lại!");
		System.out.println("---------------------------------------------");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Đăng nhập thành công");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(btnSubmit).click();
	}

	public static void main(String[] args) throws InterruptedException{
		new TestLogin().Login("buixuyen1010.94@gmail.com","123456");
	}	
}
