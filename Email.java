package Test;

import org.apache.tools.ant.taskdefs.email.Message;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.EmailUtils;

public class Email {
	private static EmailUtils emailUtils;
	WebDriver driver;
	
	 @BeforeClass
	  public static void connectToEmail() {
	    try {
	      emailUtils = new EmailUtils("ktauto6@gmail.com", "Testing@12345", "pop.gmail.com", EmailUtils.EmailFolder.INBOX);
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
	 @Test
	  public void testVerificationCode() {
	    try {

	      //TODO: Execute actions to send verification code to email
	 
	      String verificationCode = emailUtils.getAuthorizationCode();
	 
	      //TODO: Enter verification code on screen and submit
	 
	      //TODO: add assertions
	 
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
	
	  @Test
	  public void testTextContained() {
	    try{
	    javax.mail.Message email = emailUtils.getMessagesBySubject("Loan Approval", true, 5)[0];
	    Assert.assertTrue(emailUtils.isTextInMessage(email, "You have been approved"));
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
	 @Test
	  public void testLink() {
	    
	    //TODO: apply for a loan using criteria that will result in the application being rejected
	    
	    try{
	      javax.mail.Message email = emailUtils.getMessagesBySubject("Welcome to KloudScript!", true, 5)[0];
	      String link = emailUtils.getUrlsFromMessage(email, "VERIFY YOUR E-MAIL & LOG IN").get(0);
	      
	      driver.get(link);
	      
	      //TODO: continue testing
	    } catch (Exception e) {
	      e.printStackTrace();
	      Assert.fail(e.getMessage());
	    }
	  }
}
