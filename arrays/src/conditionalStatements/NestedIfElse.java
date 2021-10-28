package conditionalStatements;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert three different integer values to know which one is the greatest.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int greatest = 0;
		greatest = x > y ? x > z ? x : z : y > z ? y : z;
//		if(x > y) {
//			if(x > z) greatest = x;
//			else greatest = z;
//		}else { if(y > z) greatest = y;
//		else greatest = z;} 
		 System.out.println("The greatest of the three values is " + greatest + ".");
	}

}
