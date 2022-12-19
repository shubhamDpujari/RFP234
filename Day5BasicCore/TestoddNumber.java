package Day5BasicCore;

public class TestoddNumber {

	public static void main(String[] args) {

		int[] myArray = {23,45,67,39,56,29};
		System.out.println("odd number is given the array are:: ");

		for(int i=0; i<myArray.length; i++) {
			if(myArray[i]%2 != 0) {
				System.out.println(myArray[i]);
			}
		}



	}

}
