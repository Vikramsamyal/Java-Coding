package stringIntroduction;

public class Strings1 {

	public static void main(String[] args) {
		
		String name1 ="Vikram";
		name1 += " Singh";
		String name2 ="Vikram";
		String name3 = new String("Vikram");
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name1.equals(name3));
		System.out.println(name1.charAt(3));
		System.out.println(name3.length());
		String name4 = "My name is Vikram Singh Samyal.";
		System.out.println(name1);
		
		

	}

}
