package stringIntroduction;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to check for anagram");
		System.out.println("Enter first string.");
		String a = sc.nextLine();
		System.out.println("Enter second string to check if it's an anagram of the first.");
		String b = sc.nextLine();
		boolean[] visited = new boolean[b.length()];
		boolean isAnagram = false;
		for(int i=0;i<a.length();i++) {
		char	c = a.charAt(i);
		isAnagram = false;
		for(int j=0;j<b.length();j++) {
			if(b.charAt(j)==c && visited[j]==false ) {
				isAnagram = true;
				visited[j] = true;
				break;
			}
		} if(!isAnagram) break;
		}
		
		if(isAnagram) System.out.println("Strings are anagram.");
		else System.out.println("Strings are not an anagram.");
		
		
		

		}

}
