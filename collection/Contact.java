package collection;

import java.util.ArrayList;
import java.util.List;

public class Contact {

	private String name;
	private String email;
	private long phone;
	private String city;

	public Contact(String name, String email, long phone, String city) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", phone=" + phone + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		Contact contact = new Contact("sai","sai@123.com", 902131, "vizag");
		Contact contact1 = new Contact("shubham","sai@123.com", 902131, "vizag");


		System.out.println(contact);

		List<Contact> list  = new ArrayList<>();
		list.add(contact1);
		System.out.println(contact1);
		list.add(new Contact("shubh","sai@123.com", 902131, "vizag"));
		System.out.println(contact);
	}

}
