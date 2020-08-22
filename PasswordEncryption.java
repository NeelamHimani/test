package Pages;


import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class PasswordEncryption {
	
	
	
	 
	public static class StringEncrypt {
		
		public static void main(String args[]) {

		String original = "w";
		byte[] bytes = original.getBytes(StandardCharsets.UTF_8); 
		String base64Encoded = Base64.getEncoder().encodeToString(bytes);
		System.out.println("original text: " + original);
		System.out.println("Base64 encoded text: " + base64Encoded);
		
		
		// Decode
		byte[] asBytes = Base64.getDecoder().decode(base64Encoded);
		String base64Decoded = new String(asBytes, StandardCharsets.UTF_8);
		System.out.println("Base64 decoded text: " + base64Decoded);

	

	
		}
	}
}
