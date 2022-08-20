package assignment3;

import java.util.Scanner;

//WAP to count the number of Vowels and Consonants of a String value.
public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int vow = 0;
		int cons = 0;
		int size = str.length() - 1;
		
		for(int i = 0; i <= size; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' 
					|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' ) {
				vow++;
			}else {
				cons++;
			}
		}
		
		System.out.println("Vowels : " + vow);
		System.out.println("Consonants : " + cons);
	}

}
