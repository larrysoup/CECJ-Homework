package cecj.hw3;

public class Circle implements Shape {    // 圓
	public static final double PI = 3.1415926;
	private double radius;
	Circle(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return radius * radius * PI;
	}

	public double computeCircumference() {
		return (radius * 2) * PI;
	}
	
	public double getRadius() {
		return radius;
	}	
}
