package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the sum of it's digits.");
        int x=sc.nextInt();
        int temp = x;
        int sum = 0;
        while(temp>0) {
        	int lastDigit = temp%10;
        	sum += lastDigit;
        	temp /= 10;
        } System.out.println("The sum of digits of number " + x + " is " + sum + ".");
	}

}
