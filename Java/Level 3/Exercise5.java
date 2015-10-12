class Exercise5 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for(int i = 0; i <100; i++) {
			System.out.println(a + b);
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
