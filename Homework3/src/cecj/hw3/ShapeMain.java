package cecj.hw3;

public class ShapeMain {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Rectangle square = new Rectangle(5, 5);
		Rectangle rectangle = new Rectangle(3, 2);
		
		System.out.printf("圓的 半徑: %.2f, 面積: %.2f, 周長: %.2f%n",
				           circle.getRadius(), circle.computeArea(), circle.computeCircumference());
		System.out.printf("長方形 長: %.2f, 寬: %.2f, 面積: %.2f, 周長: %.2f%n",
						   square.getLength(), square.getBroad(), square.computeArea(), square.computeCircumference());
		System.out.printf("長方形 長: %.2f, 寬: %.2f, 面積: %.2f, 周長: %.2f%n", 
				           rectangle.getLength(), rectangle.getBroad(), rectangle.computeArea(), rectangle.computeCircumference() );
	}
}
