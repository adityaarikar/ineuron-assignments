package assignment3;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] arr = str.split(" ");
		str = "";
		
		for (String s : arr) {
			int size = s.length() - 1;
			String temp = "";
			for(int i = size; i >= 0; i--) {
				if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					temp += (char)((int)s.charAt(i) + 32);
				}else {
					temp += s.charAt(i);
				}
			}
			
			str += temp + " ";
		}
		
		System.out.println(str);
	}

}
