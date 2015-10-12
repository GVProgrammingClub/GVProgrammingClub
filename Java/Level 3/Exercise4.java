import java.util.Scanner;

class Exercise4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int in = 0;
		
		System.out.println("Enter some numbers (Enter 0 to finish): ");
		do {
			in = input.nextInt();
			sum = in + sum;
		} while(in !=0);
		
		System.out.println("Sum: " + sum);
	}
}
