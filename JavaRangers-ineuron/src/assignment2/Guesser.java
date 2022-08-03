package assignment2;

import java.util.Scanner;

public class Guesser {
	int guessNum;

	public int guessNumber() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Gusser kindly guess the number : ");
		guessNum = scan.nextInt();
		
		while(!(guessNum >= 0 && guessNum <= 10)) {
			System.out.println("[ERROR] The number you entered is out of range");
			System.out.println("Please enter the number from 0 to 10");
			guessNum = scan.nextInt();
		}

		return guessNum;
	}
}
