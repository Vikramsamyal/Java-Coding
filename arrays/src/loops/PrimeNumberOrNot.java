package loops;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a positive integer.");
        int x = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i*i<=x; i++) {
         if(x%i==0) {  isPrime = false;
           	 break;
         }
        } 
        if(x<2) isPrime = false;
        if(isPrime == true) System.out.println("Number is prime.");
        else System.out.println("Number is not prime.");
	}   

}
