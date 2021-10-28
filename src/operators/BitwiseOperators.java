package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 13;
		int c = x & y;
		int a = x | y;
		// c will give result of and operator between x and y
		// 10  =  1010 {in binary} and 13 = 1101 {in binary}
//		System.out.println(c);
//		System.out.println(a);
////		leftward shift of binary by 2 {number gets multiplied} 
//		int b = y << 2;
//		System.out.println(b);
////		rightward shift of binary by 2 {number gets divided}
//		int d = y >> 2;
//		System.out.println(d);
		 x <<= 2;
		 System.out.println(x);
		
		

	}

}
