package operators;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your grade to check whether you are eligible for boards.");
		int grade = sc.nextInt();
         if(grade == 10 || grade == 12) {
        	 System.out.println("You are eligible to appear for boards examination.");
         } else System.out.println("You can't appear for boards.12");
	}

}
