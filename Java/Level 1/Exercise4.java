Import java.util.Scanner;

class Exercise4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();

		if (in > 5) {
			System.out.println("Input is more than 5");
		} else if (in > 5) {
			System.out.println("Input is less than 5");
		} else {
			System.out.println("Input is 5");
		}
	}
}
