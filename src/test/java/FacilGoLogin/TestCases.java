package FacilGoLogin;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();
		driver.get("https://preview.facilgo.com/");
		driver.manage().window().maximize();
	}


	@AfterTest
	public void close() {
		driver.quit();
	}


	@Test
	public void testcase1() {
		Boolean bool=driver.findElement(By.xpath("//input[@id=\"user_login\"]")).isEnabled();
		System.out.println();
		if(bool==true) {
			System.out.println("Username field is working properly");
		}
		else {
			System.out.println("Username field is not working properly");
		}
		driver.navigate().refresh();
	}


	@Test
	public void testcase2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"user_login\"]")).click();
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Sdtech12@76");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(4000);
		String n1=driver.findElement(By.xpath("//*[@id=\"js-react-Alert\"]/div")).getText();
		System.out.println();
		if(n1.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(n1);
		}
		driver.navigate().refresh();
	}


	@Test
	public void testcase3() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"user_login\"]")).sendKeys("praveenkumar@sdtech.io");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Sdtech12@76");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(4000);
		String n1=driver.findElement(By.xpath("//*[@id=\"js-react-Alert\"]/div")).getText();
		System.out.println();
		if(n1.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(n1);
		}
		driver.navigate().refresh();
	}


	@Test
	public void testcase4() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"user_login\"]")).sendKeys("praveenkumar@sdtech.io");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Sdtech12@76");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(4000);
		String n1=driver.findElement(By.xpath("//*[@id=\"js-react-Alert\"]/div")).getText();
		System.out.println();
		if(n1.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(n1);
		}
		driver.navigate().refresh();
	}

	@Test
	public void testcase5() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"user_login\"]")).sendKeys("praveenkumar@sdtech.io");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Sdtech12@76");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(4000);
		String n1=driver.findElement(By.xpath("//*[@id=\"js-react-Alert\"]/div")).getText();
		System.out.println();
		if(n1.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(n1);
		}
		driver.navigate().refresh();
	}

	@Test
	public void testcase14() {
		driver.findElement(By.xpath("//*[@id=\"login-container\"]/div[1]/div/a/img")).click();
		String title=driver.getTitle();
		System.out.println();
		if(title.equalsIgnoreCase("FacilGo®")) {
			System.out.println("User redirected to FacilGo homepage");
		}else {
			System.out.println("logo fuctionality failed");
		}
	}

	@Test
	public void testcase15() {

		WebElement k1=driver.findElement(By.xpath("//*[@id=\"js-react-Alert\"]/div/div"));
		Boolean bool1=k1.isDisplayed();
		System.out.println();
		if(bool1==true) {
			System.out.println(k1.getText());
		}else {
			System.out.println("Error message functionality is failed");
		}
	}

	@Test
	public void testcase18() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-1632\"]")).click();
		String pagetitle=driver.getTitle();
		System.out.println();
		if(pagetitle.equals("Solutions - FacilGo")) {
			System.out.println("redirected to solutions page");
		}
		else {
			System.out.println("redirection is not happened");
		}
	}

	@Test
	public void testcase19() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-1633\"]")).click();
		String title2=driver.getTitle();
		System.out.println();
		if(title2.equalsIgnoreCase("Markets - FacilGo")) {
			System.out.println("redirected to markets page");
		}
		else {
			System.out.println("redirection is not happened");
		}
	}

	@Test
	public void testcase20() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-1634\"]")).click();
		String title3=driver.getTitle();
		System.out.println();
		if(title3.equalsIgnoreCase("Suppliers - FacilGo")) {
			System.out.println("redirected to suppliers page");
		}
		else {
			System.out.println("redirection is not happened");
		}
	}

	@Test
	public void testcase21() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-1635\"]")).click();
		String title4=driver.getTitle();
		System.out.println();
		if(title4.equalsIgnoreCase("Company - FacilGo")) {
			System.out.println("redirected to Company page");
		}
		else {
			System.out.println("redirection is not happened");
		}
	}

	@Test
	public void testcase22() {
		driver.findElement(By.xpath("//li[@id='menu-item-174']")).click();
		String title5=driver.getTitle();
		System.out.println();
		if(title5.equalsIgnoreCase("Blog - FacilGo")) {
			System.out.println("redirected to blog page");
		}else {
			System.out.println("Redirection is not happened");
		}
	}

	@Test
	public void testcase23() {
		driver.findElement(By.linkText("Contact Us")).click();
		String title6=driver.getTitle();
		System.out.println();
		if(title6.equalsIgnoreCase("Contact Us - FacilGo")){
			System.out.println("redirected to company page");
		}
		else {
			System.out.println("redirection is not happened");
		}
	}
	@Test
	public void testcase24() {
		driver.findElement(By.linkText("Sign in")).click();
		String title7=driver.getTitle();
		System.out.println();
		if(title7.equalsIgnoreCase("FacilGo®")) {
			System.out.println("Redirected to facilgo login page");
		}else {
			System.out.println("redirection is not happened");
		}
	}

	@Test
	public void testcase25() throws InterruptedException {
		Actions k1=new Actions(driver);
		Thread.sleep(5000);
		k1.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		String text=driver.findElement(By.xpath("//div[@id='footer']")).getText();
		System.out.println();
		if(text.equalsIgnoreCase("COPYRIGHT © 2014-2023 FACILGO INC")){
			System.out.println("copy right information is properly mentioned ");
		}
		else
		{
			System.out.println("Copy right is not mentioned properly");
		}
	}


	@Test
	public void testcase16() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("praveenkumar@sdtech.io");
		Actions s1=new Actions(driver);
		Thread.sleep(5000);
		s1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		Boolean m1=driver.findElement(By.xpath("//input[@id='user_password']")).isEnabled();
		s1.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		s1.sendKeys(Keys.ENTER).build().perform();
		System.out.println();
		if(m1==true){
			System.out.println("Tab is working properly");
		}else {
			System.out.println("Not working");
		}

		driver.navigate().refresh();
	}

	@Test
	public void testcase7() throws InterruptedException {
		Thread.sleep(5000);
		WebElement l1=driver.findElement(By.xpath("//input[@id=\"user_password\"]"));
		l1.click();
		l1.sendKeys("Praveen96");
		System.out.println();
		if(l1.isEnabled()) {
			System.out.println("Password field functionality is working properly");
		}
		else {
			System.out.println("Password field functionality is Not working properly");
		}
		driver.navigate().refresh();
	}

	@Test
	public void testcase8() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id=\"user_login\"]")).sendKeys("Praveenkumar@sdtech.io");
		Thread.sleep(5000);
		Actions a1=new Actions(driver);
		a1.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		WebElement y1=driver.findElement(By.xpath("//*[@id=\"js-react-Alert\"]/div/div"));
		String h1=y1.getText();
		System.out.println();
		if(h1.isEmpty()) {
			System.out.println("Error message functionality is not working ");
		}
		else {
			System.out.println("Error message functionality is working ");
		}

		driver.navigate().refresh();
	}	



	@Test
	public void testcase9() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"user_login\"]")).click();
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Sdtech12@76");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(4000);
		String n1=driver.findElement(By.xpath("//*[@id=\"js-react-Alert\"]/div")).getText();
		System.out.println();
		if(n1.isEmpty()) {
			System.out.println("Login Successful");
		}else {
			System.out.println(n1);
		}
		driver.navigate().refresh();
	
	}

	@Test
	public void testcase10() throws AWTException {
		driver.get("https://preview.facilgo.com/");
		Robot r1=new Robot();
		String mainWindowHandle=	driver.getWindowHandle();
		Set<String>allwindow=driver.getWindowHandles();
		Iterator<String> iterator = allwindow.iterator();
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				r1.keyPress(KeyEvent.VK_CONTROL);
				r1.keyPress(KeyEvent.VK_C);
				
				
			}

		}}}











