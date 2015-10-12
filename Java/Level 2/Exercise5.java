import java.util.Scanner;
import java.lang.Math;

class Exercise5 {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int in = input.nextInt();

		System.out.println(in + " square rooted is " + Math.sqrt(in));
	}
}
