package assignment1.com;

public class Question3 {

	public static void main(String[] args) {

		int num = 14;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				if (i == 0 || j == 0 || j == num - 1 || i == num - 1 || i + j < num / 2 || j - i >= (num - 1) / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}

	}

}
