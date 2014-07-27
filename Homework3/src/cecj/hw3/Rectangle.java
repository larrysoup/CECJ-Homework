package cecj.hw3;

public class Rectangle implements Shape{    // 長方形
	private double length;
	private double broad;
	Rectangle(double length, double broad) {
		this.length = length;
		this.broad = broad;
	}

	public double computeArea() {
		return length * broad;
	}
	
	public double computeCircumference() {
		return (length + broad) * 2;
	}
	
	public double getLength() {
		return length;
	}

	public double getBroad() {
		return broad;
	}
}
