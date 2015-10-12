import java.util.Random;

class Exercise6 {
	public static void main(String[] hey) {
		Random randumb = new Random();

		int num1 = randumb.nextInt(50);
		int num2 = randumb.nextInt(50);
		
		System.out.println(Math.max(num1, num2) + " is larger than " + Math.min(num1, num2));
	}
}
