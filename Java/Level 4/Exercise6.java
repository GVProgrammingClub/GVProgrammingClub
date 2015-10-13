import java.util.Scanner;
import java.lang.Math;

class Exercise6 {
	public static void main(String[] args) {
		double[][] points = new double[10][2];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers:");
		for(int i = 0; i < 10; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = Math.abs(Math.pow(points[i][0], 2) - 4);
		}
		
		System.out.println("Points");
		for(double[] i: points)
			System.out.printf("(%f, %f)\n", i[0], i[1]);
	}
}
