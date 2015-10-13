import java.util.Scanner;

class Exercise2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 integers: ");
		int nums[] = new Array(5);
		for(int i=0; i < 5; i++) {
			nums[i] = input.nextInt();
		}

		int sum = 0;
		for (int i: nums) {
			sum+=i;
		}
		System.out.println("Sum: " + sum);		

		double average = sum / 5;
		System.out.println("Average: " + average);

		int product = 1;
		for (int i: nums) {
			product*=i;
		}
		System.out.println("Product: " + product);
	}
}
