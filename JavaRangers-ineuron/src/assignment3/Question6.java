package assignment3;

import java.util.Scanner;

//WAP to sort a String Alphabetically.
public class Question6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int size = str.length() - 1;
		int[] arr = new int[size + 1];
		
		for(int i = 0; i <= size; i++) {
			arr[i] = (int)str.charAt(i);
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		
		str = "";
		
		for(int i = 0; i <= size; i++) {
			str += (char)arr[i];
		}
		
		System.out.println(str);
	}

}
