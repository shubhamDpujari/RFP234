package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamProblem {


	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>(Arrays.asList(
				new Employee(101, "pune", "Darshan", 50000),
				new Employee(102, "nagpur", "sai", 25000),
				new Employee(103, "mumbai", "sagar", 42000),
				new Employee(104, "pune", "shubham", 35000),
				new Employee(105, "satara", "amruta", 56000)

				));

		List<Double> salaryList = employee.stream().filter(s -> s.salary > 45000).map(ss -> ss.salary).collect(Collectors.toList());//Salary more than 50000
		System.out.println("Salary more than 45000 :- " + salaryList);

		double totalSalary = employee.stream().collect(Collectors.summingDouble(e -> e.salary)); // sum of salaries
		System.out.println("Total Salary of all the Employee :- " + totalSalary);


		Map<String, List<Employee>> list = employee.stream().collect(Collectors.groupingBy(Employee::getcity));
		System.out.println(list);

	}
}

class Employee {
	int empID;
	String city;
	String name;
	double salary;

	public Employee(int empID, String shift, String name, double salary) {
		this.empID = empID;
		this.city = city;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", shift=" + city + ", name=" + name + ", salary=" + salary + "]";
	}
}


