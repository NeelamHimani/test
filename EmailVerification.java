package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import Test.ConstantVariables;
import Test.TestBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.mail.Message;
import javax.mail.MessagingException;

public class EmailVerification {

	public static void main(String[] args) throws InterruptedException {}
	
	public static void VerifyRegistrationEmail() throws Exception {
		
		TestBase.initialize();

			// launch the Firefox browser and navigate to the website
		ConstantVariables.driver.get("https://www.gmail.com/");

		

		// locate the email field
		WebElement email = ConstantVariables.driver.findElement(By.xpath("//input[@type='email']"));

		// set the field's value
		email.sendKeys("nilamh@kloudscript.net");
		Thread.sleep(3000);
		WebElement button = ConstantVariables.driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
		button.click();
		Thread.sleep(3000);

		// locate the password field
		WebElement password = ConstantVariables.driver.findElement(By.xpath("//input[@type='password']"));

		// set the password's value
		password.sendKeys("Yaalimadad@25");
		Thread.sleep(3000);
		// locate and click the submit button
		ConstantVariables.driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		Thread.sleep(3000);
		// locate Demo Inbox and click it
		WebElement Inbox = ConstantVariables.driver.findElement(By.xpath("//a[@title='Inbox']"));

		Inbox.click();
		Thread.sleep(4000);
		
		
		List<WebElement> unreademail = ConstantVariables.driver.findElements(By.xpath("//span[@class='zF']"));

		Thread.sleep(4000);

		System.out.println("Total No. of Unread Mails: " + unreademail.size());
		

		

		//unreademail.get(0).click();

		



			/*
			 * for(WebElement latestemail : inboxEmails){ if(latestemail.isDisplayed() &&
			 * email.getText().contains("Registration")){ latestemail.click();
			 * 
			 * 
			 * }
			 */                                                                                                                                                       
		         
		   
		
		/*
		 * List<WebElement> email1 =
		 * ConstantVariables.driver.findElements(By.className("zF"));
		 * Thread.sleep(4000); for(WebElement emailsub : email1){
		 * if(emailsub.getText().equals("Welcome to KloudScript Services!") == true){
		 * 
		 * emailsub.click(); break; } }
		 */


	//	WebDriverWait wait = new WebDriverWait(ConstantVariables.driver, 15);
	//	WebElement label = wait.until(ExpectedConditions.visibilityOfElementLocated(By. xpath("//a[contains(text(),'VERIFY YOUR E-MAIL & LOG IN')]")));
	//	label.click();

		
		
		// look for the given text in the list of web elements
		/*
		 * List<WebElement> allMessages = driver.findElements(By.
		 * xpath("//*[contains(text(), 'Welcome to KloudScript!')]")); for(WebElement
		 * inboxEmail:allMessages) {
		 * if(inboxEmail.getText().equals("Welcome to KloudScript!")) {
		 * inboxEmail.click(); Thread.sleep(4000);
		 * 
		 * } }
		 */
		// WebElement email1=driver.findElement(By.xpath("//*[contains(text(), 'Welcome
		// to KloudScript!')]"));
		// Thread.sleep(4000);
		// email1.click();

		/*
		 * List<WebElement> email1 = driver.findElements(By.xpath(
		 * "/html/body/div[7]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div[4]/div[2]/div/table/tbody/tr[11]/td[5]/div/div/div/span/span\r\n"
		 * + ""));
		 * 
		 * for(WebElement emailsub : email1){
		 * if(emailsub.getText().equals("Welcome to KloudScript Services!") == true){
		 * 
		 * emailsub.click(); WebDriverWait wait = new WebDriverWait(driver, 15);
		 * WebElement label =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//a[contains(text(),'VERIFY YOUR E-MAIL & LOG IN')]")));
		 * label.click();
		 * 
		 * break; } } //check if text has been found or not if(allMessages.isEmpty()) {
		 * System.out.println("Test not passed"); }else {
		 * System.out.println("Test passed"); }
		 */

		// close the Firefox browser.
		// driver.close();

	
		
	}

	private static void until(ExpectedCondition<WebElement> visibilityOfElementLocated) {
		// TODO Auto-generated method stub
		
	}

}
