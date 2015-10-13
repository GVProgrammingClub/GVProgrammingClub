class Exercise2 {
	public static double average(int...nums) {
		double average = 0;
		for(int i: nums) {
			average+=i; 
		}
		average = average / nums.length;
		return average;
	}

	public static void main(String[] args){
		System.out.println("The average of 4, 5, 6, and 15 is " + average(4, 5, 6, 15));
	}
}
