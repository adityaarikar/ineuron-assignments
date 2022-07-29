package assignment1.com;

public class Question1 {

	public static void main(String[] args) {

		int num = 7;

		for (int i = 0; i < num; i++) {

//			print I
			for (int j = 0; j < num; j++) {
				if (i == 0 || i == num - 1 || j == num / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");

//			print N
			for (int j = 0; j < num; j++) {
				if (j == 0 || j == num - 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");

//			print E
			for (int j = 0; j < num; j++) {
				if (j == 0 || i == 0 || i == num / 2 || i == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");

//			print U
			for (int j = 0; j < num; j++) {
				if (j == 0 && i != num - 1 || j == num - 1 && i != num - 1 || i == num - 1 && j != 0 && j != num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");

//			print R
			for (int j = 0; j < num; j++) {
				if (j == 0 || i == 0 && j != num - 1 || i == num / 2 && j != num - 1
						|| j == num - 1 && i != 0 && i < num / 2 || j == i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");

//			print O
			for (int j = 0; j < num; j++) {
				if (j == 0 && i != 0 && i != num - 1 || j == num - 1 && i != 0 && i != num - 1
						|| i == 0 && j != 0 && j != num - 1 || i == num - 1 && j != 0 && j != num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");

//			print N
			for (int j = 0; j < num; j++) {
				if (j == 0 || j == num - 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
