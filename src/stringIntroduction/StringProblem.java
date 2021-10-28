package stringIntroduction;

import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter a line to reverse it's sequence of words.");
//		String str= sc.nextLine();
//		String a[] = str.split(" ");
//		for(int i=a.length-1; i>=0; i--) {
//			System.out.print(a[i] + " ");
		
		
		
		 int[] A = {1, 0, 5, 2, 8, 4};
	        int largest=A[0];
	        for(int i=1; i<A.length; i++){
	            if(largest<A[i]){
	                largest = A[i];
	            }
	        } System.out.println("The largest element of given array is " + largest + ".");
		}
		
	}


