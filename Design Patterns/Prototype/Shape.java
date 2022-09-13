public abstract class Shape implements Cloneable{
	private String shapeType;
	private int edges;
	private int vertex;
	private String unit;
	
	public abstract double calculateArea();
	
	public abstract double calculatePermiter();
	
	public String getShapeType() {
		return shapeType;
	}
	
	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
	
	public int getEdges() {
		return edges;
	}
	
	public void setEdges(int edges) {
		this.edges = edges;
	}
	
	public int getVertex() {
		return vertex;
	}
	
	public void setVertex(int vertex) {
		this.vertex = vertex;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
