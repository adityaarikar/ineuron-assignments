package assignment3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = "";
		int size = str1.length() - 1;
		
		for(int i = size; i >= 0; i--) {
			str2 += str1.charAt(i);
		}
		
		System.out.println(str2);
	}

}
