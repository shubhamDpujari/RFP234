package practicePrbDay19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
	

		public static boolean isValidFirstName(String firstName) {
			
			String regex = "^[A-Z]{1}[a-z]{2}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(firstName);
			return match.matches();
		}

		public static boolean isValidLastName(String lastname) {
			
			String regex = "^[A-Z]{1}[a-z]{2}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(lastname);
			return match.matches();
		}

		public static boolean isValidEmail(String email) {
			
			String regex =  "^[a-zA-Z0-9][a-zA-Z-0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}

		public static boolean isValidMobileNo(String number) {
			
			String regex = "^[+](91)\\s[6-9][0-9]{9}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(number);
			return match.matches();
		}
		
		


		public static void main(String args[]) {
			
			System.out.println("Enter First Name");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			if (isValidFirstName(name))
				System.out.println("It is a valid First Name.");
			else
				System.out.println("Entered Name is Invalid.");
			System.out.println();

			System.out.println("Enter last name");
			Scanner s = new Scanner(System.in);
			String lastname = s.next();

			if (isValidLastName(lastname))
				System.out.println("it is valid last name");
			else
				System.out.println("Enter Name is Invalid");
			System.out.println();

			System.out.println("Enter EmailId");
			Scanner sc1 = new Scanner(System.in);
			String email = sc1.next();
			if (isValidEmail(email)) {
				System.out.println("It is a valid EmailId.");
			} else {
				System.out.println("Entered EmailId is Invalid.");
			}

			System.out.println("Enter Phone number");
			Scanner sc2 = new Scanner(System.in);
			String number = sc2.nextLine();
			if (isValidMobileNo(number))
				System.out.println("It is a valid mobile number.");
			else
				System.out.println("Entered mobile number is invalid.");
			
			

		}

	}


