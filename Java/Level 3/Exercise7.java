import java.util.Scanner;

class Exercise7 {
	public static int factorial(int n) { //Only works for ints greater than -1
		if (n > -1 && n <=1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int in = input.nextInt();

		System.out.println(in + "! = " + factorial(in));
	}
}
