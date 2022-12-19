package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {

	private String Name;
	private int rollno;
	private int Age;



	public Student(String name, int rollno, int age) {
		super();
		Name = name;
		this.rollno = rollno;
		Age = age;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", rollno=" + rollno + ", Age=" + Age + "]";
	}

	public static void main(String[] args) {

		Student std = new Student("Sagar", 1001,12 );

		System.out.println(std);

		Student std1 = new Student("Amruta", 1003, 14);
		System.out.println(std1);

		List<Student> list = new ArrayList<>();
		list.add(std1);

		List<Student> list1 = new ArrayList<>();
		list.add(std);

		System.out.println(std  );
		System.out.println(std1);
		list.addAll(list1);
		System.out.println(list);

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			
			System.out.println(student);

		}
	}

}
