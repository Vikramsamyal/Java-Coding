package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it's a Palindrome.");
        int x=sc.nextInt();
        int temp = x;
        int reverse = 0;
        while(temp>0) {
        	int digit = temp%10;
        	temp /= 10;
        	
        	 reverse =reverse * 10 + digit;
        	
        	
        	
        }
        if(reverse == x) System.out.println("YES!! This number is a Palindrome.");
        else System.out.println("NO!! This number is not a Palindrome.");	
        
        
        
        
        
	}

}
