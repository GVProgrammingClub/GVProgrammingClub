import java.util.Scanner;
import java.lang.Math;

class Exercise3 {
	public static void main(String args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int in = input.nextInt();
		in = Math.abs(in);  //Just in case the user disregards the message
	
		for(int i = 0; i <= in; i ++) {
			System.out.println(i);
		}
	}
}
