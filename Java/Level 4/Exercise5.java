class Exercise5 {
	public static int[] incrementByFour(int[] array) {
		for (int i = 0; i < array.length; i++)
			array[i]+=4;
		return array;
	}
	
	public static void main(String[] args) {
		int[] greg = {1, 2, 3, 4, 4, 6, 7, 8, 9, 10}; //Declare an array inline

		System.out.print("Greg: ");
		for(int i:greg) //Diplays the values of greg
			System.out.print(i + ", ");
		System.out.println();
		
		greg = incrementByFour(greg);

		System.out.print("Greg+4: ");
		for(int i:greg)
			System.out.print(i + ", ");
		System.out.println();
	
	}
}
