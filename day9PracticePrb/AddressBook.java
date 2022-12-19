package day9PracticePrb;

import java.util.Scanner;
import java.util.Set;

public class AddressBook {


	String FirstName;
	String LastName;
	String Address;
	String City;
	String State;
	String Email;
	int Zipcode;
	int phonenumber;





	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getZipcode() {
		return Zipcode;
	}
	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}


	@Override
	public String toString() {
		return "AddressBook [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City="
				+ City + ", State=" + State + ", Email=" + Email + ", Zipcode=" + Zipcode + ", phonenumber="
				+ phonenumber + "]";
	}
	public void addDetails()
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first Name");
		FirstName = input.nextLine();

		System.out.println("Enter your last name");
		LastName = input.nextLine();

		System.out.println("Enter your Address");
		Address = input.nextLine();

		System.out.println("Enter your city");
		City = input.nextLine();

		System.out.println("Enter your state name");
		State = input.nextLine();

		System.out.println("Enter your email id");
		Email = input.nextLine();

		System.out.println("enter your zipcode");
		Zipcode = input.nextInt();

		System.out.println("Enter your phone number");
		phonenumber =input.nextInt();




	}
	public void display()
	{
		System.out.println("First Name: "+ FirstName);
		System.out.println("last name: "+ LastName);
		System.out.println("First Name: "+ Address);
		System.out.println("First Name: "+ City);
		System.out.println("First Name: "+ State);
		System.out.println("First Name: "+ Email);
		System.out.println("First Name: "+ Zipcode);
		System.out.println("First Name: "+ phonenumber);
	}
	public void editDetails()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("choose any option : ");
		System.out.println("1. First Name :");
		System.out.println("2. Last Name :");
		System.out.println("3. Address : ");
		System.out.println("4. City : ");
		System.out.println("5. State : ");
		System.out.println("6. Email : ");
		System.out.println("7. Zipcode : ");
		System.out.println("phonenumber : ");

		int option = sc.nextInt();

		switch (option)
		{
		case 1:
			System.out.println("Enter your first name");
			FirstName = sc.nextLine();
			setFirstName(FirstName);
			break;
		case 2:
			System.out.println("Enter your last name");
			LastName = sc.nextLine();
			setLastName(LastName);
			break;
		case 3:
			System.out.println("Enter your Address ");
			Address = sc.nextLine();
			setAddress(Address);
			break;
		case 4:
			System.out.println("Enter your city name");
			City = sc.nextLine();
			setCity(City);
			break;
		case 5:
			System.out.println("Enter your State name");
			State = sc.nextLine();
			setState(State);
			break;
		case 6:
			System.out.println("Enter your Email id");
			Email = sc.nextLine();
			setEmail(Email);
			break;
		case 7:
			System.out.println("Enter your Zipcode");
			Zipcode = sc.nextInt();
			setZipcode(Zipcode);
			break;
		case 8:
			System.out.println("enter your phonenumber");
			phonenumber = sc.nextInt();
			setPhonenumber(phonenumber);
			break;
		}

	}
	public void deleteDetails()
	{
		FirstName = null ;
		LastName = null ;
		Address = null ;
		City = null ;
		State = null ;
		Email = null ;
		Zipcode = 0 ;
		phonenumber = 0 ;

	}

	public static void main(String[] args) {
		System.out.println("welcome to Address Book program in AddressBook");
		AddressBook obj = new AddressBook ();
		Scanner input = new Scanner (System.in);

		boolean add = true;

		while (add)
		{
			System.out.println("choose any option : ");
			System.out.println("1. add Details : ");
			System.out.println("2. Display Details :");
			System.out.println("3. Edit Details :");
			System.out.println("4. Delete Details :");

			int choose = input.nextInt();

			switch (choose)
			{
			case 1:
				obj.addDetails();
				break;
			case 2:
				obj.display();
				break;
			case 3:
				obj.editDetails();
				break;
			case 4:
				obj.deleteDetails();
				break;
			case 5:
				add = false;
				break;
			default :
				System.out.println("please choose correct option" );

			}
		}


	}


}
