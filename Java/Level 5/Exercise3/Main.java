class Main {
	public static void main(String[] args) {
		Person george = new Person(16, "George", "Georgeson");
		Person john = new Person(17, "John", "Johnson");

		System.out.printf("Name:%s %s, Age: %d\n", george.getFirstName(), george.getLastName(), george.getAge());
		System.out.printf("Name:%s %s, Age: %d\n", john.getFirstName(), john.getLastName(), john.getAge());
	}
}
