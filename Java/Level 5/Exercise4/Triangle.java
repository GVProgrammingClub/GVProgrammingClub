class Triangle {
	private int base;
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}

	public double getArea() {
		return .5 * base * height;
	}
}
