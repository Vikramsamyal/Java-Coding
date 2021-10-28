package conditionalStatements;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
           System.out.println("Enter the day number 1, 2 or 3.");
           int day = sc.nextInt();
           switch(day) {
           case 1: 
        	   System.out.println("I'm watching T.V.");
        	   break;
           case 2:
        	   System.out.println("I'm playing football.");
               break;
           case 3:
        	   System.out.println("I'm learning to code java.");
        	   break;
           default: System.out.println("Enter valid day number.");
           }
	}

}
