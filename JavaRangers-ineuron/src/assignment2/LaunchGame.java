package assignment2;

public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		int[] score = {0,0,0};
		
		for(int i = 1; i < 4; i++) {
			System.out.println("Round " + i);
			
			u.collectNumFromGuesser();
			u.collectNumberFromPlayer();
			u.compare(i, score);
		}
		
		if(score[0] > score[1] && score[0] > score[2]) {
			System.out.println("[RESULT] PLAYER 1 WON."); 
		}else if(score[1] > score[2]) {
			System.out.println("[RESULT] PLAYER 2 WON."); 
		}else {
			System.out.println("[RESULT] PLAYER 3 WON."); 
		}
	}
}

