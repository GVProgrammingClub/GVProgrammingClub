import java.util.Scanner;

class Exercise4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strings = new String[7];
		
		System.out.println("Enter 7 strings: ");
		for(int i = 0; i < 7; i ++) { //Gets the tasty strings
			strings[i] = input.nextLine(); //Use .nextLine() to be able to get strings with spaces
		}

		/* Variable to hold the length of the shortest String.  It is initialized to this lenth
		 * Arbitrarily so it can hold a true value for comparison.
		 */
		int shortestLength = strings[0].length();
		int shortestIndex = 0; //Location in the array of the shortest string

		for (int i = 0; i < 5; i++) {
			if(strings[i].length() < shortestLength) {
				shortestLength = strings[i].length();
				shortestIndex = i;
			}
		}
		
		System.out.printf("The shortest sting is %s with a length of %d\n", strings[shortestIndex], shortestLength);
	}
}
