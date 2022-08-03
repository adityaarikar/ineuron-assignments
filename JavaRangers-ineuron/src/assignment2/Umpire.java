package assignment2;

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int[] score = {0,0,0};
	
	void collectNumFromGuesser(){
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}
	
	void collectNumberFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
	}
	
	void compare(int i, int[] score){
		if(numFromGuesser == numFromPlayer1) {
			
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Round tied all three player guessed correctly.");
				score[1] = score[1] + 1;
				score[2] = score[2] + 1;
				
			}else if(numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player 2 won the " + i + "round.");
				score[1] = score[1] + 1;
			}else if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 and Player 3 won the " + i + "round.");
				score[2] = score[2] + 1;
			}else {
				System.out.println("Player 1 won the " + i + "round");
			}
			score[0] = score[0] + 1;
			
		}else if(numFromGuesser == numFromPlayer2) {
			
			if(numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player 3 won the " + i + "round.");
				score[2] = score[2] + 1;
			}else{
				System.out.println("Player 2 won the " + i + "round.");
			}	
			score[1] = score[1] + 1;
			
		}else if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the " + i + "round.");
			score[2] = score[2] + 1;
		}else {
			System.out.println("Game Lost! Try Again...");
		}
	}
}
