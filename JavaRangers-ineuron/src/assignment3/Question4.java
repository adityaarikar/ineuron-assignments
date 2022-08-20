package assignment3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int size = str.length() - 1;
		int[] arr = new int[size + 1];
		
		str = str.toLowerCase();		
		boolean[] present = new boolean[26];
		
		for(int i = 0; i < arr.length;i++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				int letter = str.charAt(i) - 'a';
				present[letter] = true;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			if(!present[i]) {
				System.out.println("The String is not panagram");
				return;
			}
		}
		
		System.out.println("The String is panagram");
		return;
	}

}
