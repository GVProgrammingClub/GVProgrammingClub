import java.util.Scanner;

class Exercise6 {
	public static double area(double b, double h) {
		return .5 * b * h;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the height: ");
		double height = input.nextDouble();

		System.out.print("Enter the base: ");
		double base = input.nextDouble();

		System.out.println("Area: " + area(height, base));
	}
}
