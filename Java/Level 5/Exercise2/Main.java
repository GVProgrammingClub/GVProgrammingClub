class Main {
	public static void main(String[] args) {
		Stache stache = new Stache();

		stache.setInt(89);
		stache.setInt(stache.getInt() * stache.getInt());

		stache.setString("Pineapple");

		System.out.printf("String: %s\nInt: %d\n", stache.getString(), stache.getInt());
	}
}
