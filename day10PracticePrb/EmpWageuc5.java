package day10PracticePrb;

public class EmpWageuc5 {

	public static final int isparttime = 1;
	public static final int isfulltime = 2;
	public static final int emprateperhr =20;
	public static final int numofworkingdays = 2;

	public void monthwage() {

		int emphrs = 0;
		int empWage = 0;
		int totalempWage = 0;

		for (int day = 0; day < numofworkingdays; day++);{
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case isparttime:
				emphrs = 4;
				break;
			case isfulltime:
				emphrs = 8;
				break;

			}
			empWage = emphrs * emprateperhr;
			totalempWage += empWage;
			System.out.println("empWage: "+empWage);
		}
		System.out.println("totalempWage "+totalempWage);

	}

	public static void main(String[] args) {
		EmpWageuc5 emp = new EmpWageuc5();
		emp.monthwage();



	}

}
