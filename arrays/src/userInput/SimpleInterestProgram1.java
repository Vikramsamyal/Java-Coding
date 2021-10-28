package userInput;
import java.util.Scanner;

public class SimpleInterestProgram1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give principal value in integer.");
		int principal = sc.nextInt();
		System.out.println("Give rate value.");
		float rate = sc.nextFloat();
		System.out.println("Give time value in months.");
		int time = sc.nextInt();
		float simpleInterest = principal * rate * time / 100;
		System.out.println("The simple interest is " + simpleInterest + ".");
		

	}

}
