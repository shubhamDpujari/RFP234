package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;


import java.util.List;

public class Stream {

	List<Employe> employee = new ArrayList<>(Arrays.asList(
			new Employe(101, "pune", "Darshan", 50000),
			new Employe(102, "mumbai", "Rahul", 25000),
			new Employe(103, "Nagpur", "sai", 42000),
			new Employe(104, "nashik", "shubham", 35000),
			new Employe(105, "satara", "Pratik", 56000)

			));

	List<Double> salaryList = Employe.stream().filter(s -> s.salary > 45000).map(ss -> ss.salary).collect(Collectors.toList());//Salary more than 50000
	System.out.println("Salary more than 45000 :- " + salaryList);

	double totalSalary = employe.stream().collect(Collectors.summingDouble(e -> e.salary)); // sum of salaries
	System.out.println("Total Salary of all the Employee :- " + totalSalary);

	Map<String, List<Employe>> list = employee.stream().collect(Collectors.groupingBy(Employee::getShift));
	System.out.println(list);

       }
   }
   }





