package assignment3;

import java.util.Scanner;

//WAP to count number of special characters.
public class Question8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int size = str.length() - 1;
		int special = 0;
		for(int i = 0; i <= size; i++) {
			if(!((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90)){
				if(!((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122)) {
					special++;
					System.out.println((int)str.charAt(i));
				}
			}
		}

		System.out.println(special);
	}
}
