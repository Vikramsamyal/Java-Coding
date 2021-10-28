package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of terms in the series.");
		int x=sc.nextInt();
		float sum =0;
		for(float i=1; i<=x; i++) {
			if(i%2==0) {
				sum -= 1/i; 
			} else {
				sum += 1/i;
			}
		} System.out.println("The result is " + sum + ".");

	}

}
