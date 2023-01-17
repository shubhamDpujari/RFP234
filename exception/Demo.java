package exception;


public class Demo {
	
	void display() {
		try
		{
			int a = 5/0;
		}
		catch(ArithmaticException e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handeled...");
	}

	public static void main(String[] args) {
	    Demo dm = new Demo();
	    dm.display();
	    

	}

}
