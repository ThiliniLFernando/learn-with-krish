public class Application {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;

		try {
			
			ShapeRegistry registry = new ShapeRegistry();
			start = System.currentTimeMillis();
			Circle circle = (Circle) registry.getShape(ShapeType.CIRCLE);
			end = System.currentTimeMillis();
			System.out.println(circle);
			System.out.println(end-start);
			
			circle.setRadius(14);
			System.out.println(circle);
			System.out.println("............................");
			

			Circle circle1 = (Circle) registry.getShape(ShapeType.CIRCLE);
			System.out.println(circle1);

			start = System.currentTimeMillis();
			Circle circle2 = new Circle();
			end = System.currentTimeMillis();
			System.out.println(circle2);
			System.out.println(end-start);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
