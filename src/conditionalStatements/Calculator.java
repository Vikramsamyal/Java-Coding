package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the your first CALCULATOR!!!");
		System.out.println("Enter the first value.");
		float x = sc.nextFloat();
		System.out.println("Enter the operation (+, -, * and /).");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		System.out.println("Enter the second value.");
		float y = sc.nextFloat();
		float z = 0;
		
		switch(operation) {
		case '+': 
		    z = x + y;
		    break;
		case '-':
			z = x - y;
			break;
		case '*':
			z = x * y;
			break;
		case '/':
			z = x / y;
			break;
		default:
			System.out.println("Invalid operation");
		}
		System.out.println("The result is " + z + ".");

	}

}
