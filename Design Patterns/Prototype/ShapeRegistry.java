import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
	private Map<ShapeType, Shape> shapes;
	
	public ShapeRegistry() {
		shapes = new HashMap<ShapeType, Shape>();
		this.initializeShape();
	}
	
	public Shape getShape(ShapeType shapeType) throws CloneNotSupportedException {
		Shape shape = (Shape) shapes.get(shapeType).clone();
		return shape;
	}

	private void initializeShape() {
		Circle circle = new Circle();
		circle.setShapeType("Circle");
		circle.setEdges(0);
		circle.setVertex(0);
		circle.setRadius(7);
		
		Rectangle rec = new Rectangle();
		rec.setShapeType("Rectangle");
		rec.setEdges(4);
		rec.setVertex(4);
		rec.setLength(7);
		rec.setWidth(100);
		
		Trangle trangle = new Trangle();
		trangle.setShapeType("Trangle");
		trangle.setEdges(3);
		trangle.setVertex(3);
		trangle.setbSide(10);
		trangle.setaSide(10);
		trangle.setBase(10);
		trangle.setHeight(5);
		
		shapes.put(ShapeType.CIRCLE, circle);
		shapes.put(ShapeType.RECTANGLE, rec);
		shapes.put(ShapeType.TRANGLE, trangle);
		
	}
	
}
