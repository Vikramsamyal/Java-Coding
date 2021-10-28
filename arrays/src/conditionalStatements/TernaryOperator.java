package conditionalStatements;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert two numbers to compare them.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int greater = 0;
		greater = x > y ? x : y;
		System.out.println("The greater of the two numbers is " + greater + ".");
		 

	}

}
