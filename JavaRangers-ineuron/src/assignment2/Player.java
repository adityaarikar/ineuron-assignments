package assignment2;

import java.util.Scanner;

public class Player {
	int playerGuessNum;

	public int guessNumber() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Player kindly guess the number : ");
		int playerGuessNum = scan.nextInt();
		
		while(!(playerGuessNum >= 0 && playerGuessNum <= 10)) {
			System.out.println("[ERROR] The number you entered is out of range");
			System.out.println("Please enter the number from 0 to 10");
			playerGuessNum = scan.nextInt();
		}
		
		return playerGuessNum;
	}
}
