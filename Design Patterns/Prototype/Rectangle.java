public class Rectangle extends Shape {
	private double length;
	private double width;
	
	@Override
	public double calculateArea() {
		return width*length;
	}
	
	@Override
	public double calculatePermiter() {
		return 2*(length+width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", Area = " + calculateArea()
				+ " square units, Permiter =" + calculatePermiter() + " units]";
	}
	
}
