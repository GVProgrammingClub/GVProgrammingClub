class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(int age, String firstName, String lastName) { //Constructor
		this.age = age;  //This.age references the variable in the class while age is referencable only in the method
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}
}
