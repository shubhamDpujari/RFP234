package practicePrbDay16And17;
import java.util.Scanner;

public class InsertionSort {
	
		 void sort(int arr[])
		    {
		        int n = arr.length;
		        for (int i = 1; i < n; ++i) {
		            int curr = arr[i];
		            int prev = i - 1;
		 
		           
		            while (prev >= 0 && arr[prev] > curr) {
		                arr[prev + 1] = arr[prev];
		                prev = prev - 1;
		            }
		            arr[prev + 1] = curr;
		        }
		    }
		 
		    
		    static void printArray(int arr[])
		    {
		        int n = arr.length;
		        for (int i = 0; i < n; ++i)
		            System.out.print(arr[i] + " ");
		 
		        System.out.println();
		    }
		 
		    
		    public static void main(String args[])
		    {
		        int arr[] = { 12, 11, 13, 5, 6 };
		 
		        InsertionSort ob = new InsertionSort();
		        ob.sort(arr);
		 
		        printArray(arr);
		    }
		


		

	}


