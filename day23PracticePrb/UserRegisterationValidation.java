package day23PracticePrb;
import java.util.Scanner;
import java.util.function.Predicate;


public class UserRegisterationValidation {
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter First Name:");
			String firstName = sc.next();
			validateInput("It is a valid First Name.", "Entered Name is Invalid.",
					(name) -> name.matches("^[A-Z]{1}[a-z]{2}$"), firstName);

			System.out.println("Enter Last Name:");
			String lastName = sc.next();
			validateInput("It is a valid Last Name.", "Entered Name is Invalid.",
					(name) -> name.matches("^[A-Z]{1}[a-z]{2}$"), lastName);

			System.out.println("Enter Email:");
			String email = sc.next();
			validateInput("It is a valid Email.", "Entered Email is Invalid.", 
					(name) -> email.matches(
					"^[a-zA-Z0-9][a-zA-Z-0-9_+]*([.][a-zA-Z0-9]+)?[@][a-zA-Z-0-9]+[.][a-z]{2,4}([.][a-zA-Z]{2,4})?$"),
					email);

			System.out.println("Enter Phone Number:");
			String phoneNumber = sc.next();
			validateInput("It is a valid Phone Number.", "Entered Phone Number is Invalid.",
					(number) -> number.matches("^[+](91)\\s[6-9][0-9]{9}$"), phoneNumber);
		}

		public static void validateInput(String validMessage, String invalidMessage, Predicate<String> validation,
				String input) {
			if (validation.test(input)) {
				System.out.println(validMessage);
			} else {
				System.out.println(invalidMessage);
			}
		}

	}


