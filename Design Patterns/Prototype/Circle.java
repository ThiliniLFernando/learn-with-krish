public class Circle extends Shape {
	private double radius;
	
	@Override
	public double calculateArea() {
		return (22/7*radius*radius);
	}
	
	@Override
	public double calculatePermiter() {
		return 2*(22/7)*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Area = " + calculateArea() + "square units, Permiter = "
				+ calculatePermiter() + "units]";
	}
	
}
