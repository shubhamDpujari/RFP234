package day10PracticePrb;

public class EmployeeWageBuilder {

	public static final int isParttime = 1;
	public static final int isfulltime = 2;
	public static final int emprateperhr = 20;
	

	public void SwitchCase() {
		int emphrs = 0; 
		int empwage = 0;

		int empcheck = (int) Math.floor(Math.random() * 10) % 3;

		switch (empcheck) {
		
		case isParttime:    
			emphrs = 4;
			break;
		
		case isfulltime:
			emphrs = 8;
			break;
	   }
		empwage = emphrs * emprateperhr;
		System.out.println("empwage " +empwage);

	}


	public static void main(String[] args) {
		EmployeeWageBuilder emp = new  EmployeeWageBuilder();

		emp.SwitchCase();



	}

}
