package assignment1.com;

public class Question4 {

	public static void main(String[] args) {

		int num = 14;

		for (int i = 0; i <= num / 2; i++) {
			for (int j = 0; j < num; j++) {
				if (j <= i || j + i >= num - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
