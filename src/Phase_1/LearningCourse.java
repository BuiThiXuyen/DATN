package Phase_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearningCourse {

	By btnLogin = By.xpath("//a[@class='btn btn-quaternary ng-binding']");
    By btnSubmit = By.xpath("//button[@class='btn btn-primary mb10 ng-binding']");
    By btnCourseLearning = By.xpath("//div//a[@target='_self']");
    By course = By.xpath("//div[@class='card__image_mc play-button-trigger course-img']");
    //By course = By.name("TỬ HUYỆT NGÔN TỪ");
	By tabcontent = By.xpath("//span[contains(@class,'ng-binding') and "
			+ "contains(text(), 'Nội dung khóa học')]");
	By chapter1 = By.xpath("//span[contains(@class,'ng-binding') and contains(text(), 'Sức mạnh của ngôn từ')]");
	//By lecture1 =By.xpath("//span[contains(@class,'lecture-item-link-name ng-binding') and "
			//+ "contains(text(), 'Bài học về sức mạnh của ngôn từ')]");
	//By lecture2 = By.xpath("//span[contains(@class,'lecture-item-link-name ng-binding') and "
			//+ "contains(text(), 'Bài học về Tình huống tâm lý gia đình')]");
	By next = By.xpath("//button[@class='btn-control continue-button continue-button--responsive--3c3TI btn btn-sm btn-secondary']");
	By finishcourse = By.xpath("//button[@class='btn-control continue-button continue-button--responsive--3c3TI btn btn-sm btn-primary']");
	By btnQA = By.xpath("//button[@class='btn btn-sm btn-control btn-default']");
	By btncreateQA = By.xpath("//button[@class='ml5 btn btn-primary ask-button']");
	By textboxtitleQA = By.id("addNewQuestion");
	By contentQA = By.xpath("//div[@ta-bind='ta-bind']");
	By saveQA = By.xpath("//button[@ng-click='saveQuestion()']");
	By closeQA = By.xpath("//i[@ng-click='closeQuestions()']");
	By btnnext = By.xpath("//button[@ng-click='goToNextQuiz()']");
	By leftmenu = By.xpath("//span//i[@class='fa fa-list-ul']");
	By closeleftmenu = By.xpath("//span//i[@class='fa fa-times']");
	By btncoursepage = By.xpath("//a//span[contains(@class,'ng-binding') and "
			+ "contains(text(), 'Trang khóa học')]");
	By certificate = By.xpath("//div[@class='progress']");
	By btnbookmark = By.xpath("//button[@class='btn btn-sm btn-control btn-default']");
	By textboxbookmark= By.xpath("//span//i[class='marker-content']");
	
	public void LearnCourse () throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.medu.vn/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(btnLogin).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("phiha1802@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(btnSubmit).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(btnCourseLearning).click();
		
		Thread.sleep(1000);
		driver.findElement(course).click();			
		
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(btnQA).click();
		driver.findElement(btncreateQA).click();
		driver.findElement(textboxtitleQA).sendKeys("<h1>Tạo câu hỏi test</h1>");
		driver.findElement(saveQA).click();
		Thread.sleep(1000);
		driver.findElement(closeQA).click();
		
		driver.findElement(next).click();
		Thread.sleep(1000);
		//driver.findElement(btnnext).click();
		//Thread.sleep(1000);
		//driver.findElement(leftmenu).click();
		//driver.findElement(chapter1).click();
		//driver.findElement(lecture2).click();
		
		//driver.findElement(closeleftmenu).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".continue-button--btn__label")).click();
		
		System.out.println("Chúc mừng! Bạn đã hoàn thành khóa học TỬ HUYỆT NGÔN TỪ");
	}
	
	public static void main (String[] args) throws InterruptedException{
		new LearningCourse().LearnCourse();
	}
}
