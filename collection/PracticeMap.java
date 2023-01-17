package collection;

import java.util.HashMap;
import java.util.Map;

public class PracticeMap {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("shubham", 90);
		numbers.put("sagar", 60);
		numbers.put("sai", 90);
		
		if(!numbers.containsKey("ram")) {
			numbers.put("ram", 80);
		}
		if(!numbers.containsKey("ram")) {
			numbers.put("ram", 70);
		}
		 for ( String key : numbers.keySet()) {
			 System.out.println(key);
		 }
		 for (Integer value : numbers.values()) {
			 System.out.println(value);
		 }
		 
		
		System.out.println(numbers);
		
		

	}

}
