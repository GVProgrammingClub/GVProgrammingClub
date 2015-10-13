class Exercise1 {
	public static int sum(int...nums) { //The ... allows for any number of numbers to be inputted
		int sum = 0;
		for(int i: nums){ //Enhanced for loop
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("The sum of 5, 6, 7, 9, and 12 is " + sum(5, 6, 7, 9, 12));
	}
}
