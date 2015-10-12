import java.util.Scanner;
import java.lang.Math;

class Exercise4 {
	public static void main(String[] margs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int in = input.nextInt();

		System.out.println(in + "^3=" + Math.pow(in, 3));
	}
}
