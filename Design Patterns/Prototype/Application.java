public class Application {

	public static void main(String[] args) {
		try {
			
			ShapeRegistry registry = new ShapeRegistry();
			Circle circle = (Circle) registry.getShape(ShapeType.CIRCLE);
			System.out.println(circle);
			
			circle.setRadius(14);
			System.out.println(circle);
			System.out.println("............................");
			

			Circle circle1 = (Circle) registry.getShape(ShapeType.CIRCLE);
			System.out.println(circle1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
