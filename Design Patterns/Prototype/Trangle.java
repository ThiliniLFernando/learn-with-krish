public class Trangle extends Shape {
	private double aSide;
	private double bSide;
	private double base;
	private double height;
	
	@Override
	public double calculateArea() {
		return (base*height)/2;
	}
	
	@Override
	public double calculatePermiter() {
		return (aSide+bSide+base);
	}

	public double getaSide() {
		return aSide;
	}

	public void setaSide(double aSide) {
		this.aSide = aSide;
	}

	public double getbSide() {
		return bSide;
	}

	public void setbSide(double bSide) {
		this.bSide = bSide;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Trangle [aSide=" + aSide + ", bSide=" + bSide + ", base=" + base + ", height=" + height
				+ ", Area = " + calculateArea() + "square units , Permiter = " + calculatePermiter() + " units]";
	}
	
	

}
