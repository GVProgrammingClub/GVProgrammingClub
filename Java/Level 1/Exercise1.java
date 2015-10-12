import java.util.Scanner;

class Exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Creates a scanner

		System.out.print("Enter an Integer: "); //Prompts the user, notice the use of System.out.print()
		int in = input.nextInt(); //Creates an integer input and sets it equal to the user's input
		
		System.out.println((in) + " * 3 = " + (in*3));
	}
}
