import java.util.Scanner;

class Exercise2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int in = input.nextInt();

		if (in < -6 || in >12) {
			System.out.println(in + " is either less than -6 or more than 12");
		}
	}
}
