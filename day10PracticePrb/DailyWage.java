package day10PracticePrb;

public class DailyWage {

	private static final int Random = 0;
	String name = "Employee";
	String num1 = "Employee full time";
	String num2 = "Employee part time";
	int emprateperhr = 20;
	int emphrs = 8;
	int wage = (emphrs * emprateperhr);
	int isfulltime = 2;
	int isparttime =1;
	int emphrs1 =16;
	int emphrs2 =8;
	int wage1 = (emphrs1 * emprateperhr);
	int wage2 = (emphrs2 * emprateperhr);

//uc1
	public void welcome() {
		System.out.println("Welcome to Employee Wage");
	}

//uc2
	public void Attendance () {
		int isfulltime = 1;

		double empcheck = Math.floor(Math.random() * 10) % 2;

		if (empcheck == isfulltime) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

//uc3
	public void empwage( ) {
		int ispresent =1;
		double randomcheck = (Math.random() % 2);
		if (ispresent == randomcheck) {
			emprateperhr = 20;
			emphrs = 8;

			System.out.println("Employee wage of the day is: "+wage);
		}
		else
		{ emphrs =0;
		System.out.println("Employee wage of the day is: "+wage);
		}
	}

//uc4
	public void parttime() {

		if (isfulltime ==2) {
			emphrs2 = 16;
			wage1 =(emphrs1 * emprateperhr);
			System.out.println("employee is full time and salary is: "+wage);
		}else if (isparttime ==1) {
			emphrs2 = 8;
			System.out.println("employee is part time and salary is: "+wage);
		} else
			emphrs =0;

	}

	public static void main(String[] args) {
		DailyWage emp = new DailyWage();
		emp.welcome();
		emp.Attendance();
		emp.empwage();
		emp.parttime();

	}

}
