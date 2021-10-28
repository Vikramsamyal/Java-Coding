package loops;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find it's number of digits.");
		int x = sc.nextInt();
		int numberOfDigits = (int)Math.log10(x) +1;
		System.out.println("The number of digits are "+ numberOfDigits + ".");

	}

}
