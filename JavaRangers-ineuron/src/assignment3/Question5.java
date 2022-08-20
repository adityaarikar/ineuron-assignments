package assignment3;

import java.util.Scanner;

//WAP to print repeatedly occurring characters in the given String.

public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int size = str.length() - 1;
		int[] arr = new int[size + 1];
		
		str = str.toLowerCase();
		
		for(int i = 0; i <= size; i++) {
			arr[i] = (int)str.charAt(i);
		}
		
		for(int i = 1; i <= size; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println((char)arr[i]);
				}
			}
		}
		return;
	}

}
