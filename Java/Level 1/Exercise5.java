import java.util.Scanner;

class Exercise5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Are you ready?");
		String response = input.next();

		if (response.equals("yes")) {
			System.out.println("Fantastic!!");
		} else if(response.equals("no")) {
			System.out.println("Prepare yourself!");
		} else {
			System.out.println("Unrecognized response");
		}
	}
}
