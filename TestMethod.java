package com.blz.regex;
import org.junit.Assert;
import org.junit.Test;

public class TestMethods {
	
	@Test
	public void testWhenFirstName_isProper_returnTrue() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validateName("Devraj");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testWhenFirstName_isNotProper_returnFalse() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validateName("123Devraj");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testWhenLastName_isProper_returnTrue() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validateName("Sharma");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenLastName_isNotProper_returnFalses() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validateName("Pi321");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testWhenEmail_isProper_returnTrue() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validateEmail("kalpesh321@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenEmail_isNotProper_returnTrue() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validateEmail("_kalp@google.co.aus");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testWhenMobileNumber_isProper_returnTrue() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validateMobileNumber("91 9988770000");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenMobileNumber_isNotProper_returnFalses() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validateMobileNumber("9876453210");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testWhenPassword_isProper_returnTrue() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validatePassword("Password321$pkkaddd");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenPassword_isNotProper_returnFalses() {
		UserRegistrationJUnit validate = new UserRegistrationJUnit();
		boolean result = validate.validatePassword("passwordjsnfksjf");
		Assert.assertFalse(result);
	}

}