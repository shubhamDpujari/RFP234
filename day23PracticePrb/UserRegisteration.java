package day23PracticePrb;
import java.io.InvalidClassException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {
	
		private static final String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
		private static final String LAST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
		private static final String EMAIL_REGEX = "^[a-zA-Z0-9][a-zA-Z-0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?$";
		private static final String MOBILE_NUMBER_REGEX = "^[+](91)\\s[6-9][0-9]{9}$";
		private static final String PASSWORD_REGEX = "^(?=\\S+$).{8,}$";

		public static boolean isValidFirstName(String firstName) throws Exception {
			Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
			Matcher match = pattern.matcher(firstName);
			if (!match.matches()) {
				throw new Exception("Invalid first name: " + firstName);
			}
			return true;
		}

		public static boolean isValidLastName(String lastName) throws Exception {
			Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
			Matcher match = pattern.matcher(lastName);
			if (!match.matches()) {
				throw new Exception("Invalid last name: " + lastName);
			}
			return true;
		}

		public static boolean isValidEmail(String email) throws Exception {
			Pattern pattern = Pattern.compile(EMAIL_REGEX);
			Matcher matcher = pattern.matcher(email);
			if (!matcher.matches()) {
				throw new Exception("Invalid email: " + email);
			}
			return true;
		}

		public static boolean isValidMobileNo(String number) throws Throwable {
			Pattern pattern = Pattern.compile(MOBILE_NUMBER_REGEX);
			Matcher match = pattern.matcher(number);
			if (!match.matches()) {
				throw new Exception("Invalid mobile number: " + number);
			}
			return true;
		}

		public static boolean isValidPassword(String password) throws Exception {
			Pattern pattern = Pattern.compile(PASSWORD_REGEX);
			if (password == null) {
				throw new Exception("Password is null");
			}
			Matcher match = pattern.matcher(password);
			if (!match.matches()) {
				throw new Exception("Invalid password: " + password);
			}
			return true;
		}

		public static void main(String[] args) {
			String firstName = "Sai";
			String lastName = "Kumar";
			String email = "saikumar8978@gmail.com";
			String mobile = "+91 7784657890";
			String password = "password";
			
		}

	}


