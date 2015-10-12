import java.util.Scanner;

class Exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Creates a scanner

		System.out.print("Enter an Integer: ") //Prompts the user, notice the use of System.out.print()
		int input = input.nextInt(); //Creates an integer input and sets it equal to the user's input
		
		System.out.println((input) + " * 3 = " + (input*3));
	}
}
