import java.util.Scanner;

class Exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int in = input.nextInt();

		if (in > 3 && in < 7) {
			System.out.println(in +" is less than 7 and more than 3");
		}
			
	}
}
