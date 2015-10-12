import java.util.Random;
import java.util.Scanner;

class Exercise3 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int rand = random.nextInt(16);

		System.out.print("Enter a whole number: ");
		int in = input.nextInt();

		if (in < rand) {
			System.out.println("Your number is less than " + rand);
		}	
	}
}
