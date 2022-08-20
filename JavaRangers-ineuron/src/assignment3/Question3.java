package assignment3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		int size1 = str1.length() - 1;
		int[] arr1 = new int[size1 + 1];
		int size2 = str2.length() - 1;
		int[] arr2 = new int[size2 + 1];
		
		if(size1 != size2) {
			System.out.println("Strings are not Anagram");
			return;
		}
		
		for(int i = 0; i <= size1; i++) {
			arr1[i] = (int)str1.charAt(i);
		}
		
		for(int i = 0; i <= size2; i++) {
			arr2[i] = (int)str2.charAt(i);
		}
		
		for(int i = 0; i < arr1.length - 1; i++) {
			for(int j = 1; j < arr1.length; j++) {
				if(arr1[j] < arr1[j - 1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j - 1];
					arr1[j - 1] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr2.length - 1; i++) {
			for(int j = 1; j < arr2.length; j++) {
				if(arr2[j] < arr2[j - 1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j - 1];
					arr2[j - 1] = temp;
				}
			}
		}
		
		boolean flag = true;
		
		for(int i = 0; i <= size1; i++) {
			if(arr1[i] != arr2[i]) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are not Anagram");
		}
	}

}
