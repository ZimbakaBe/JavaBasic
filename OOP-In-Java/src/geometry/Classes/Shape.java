package geometry.Classes;

import geometry.Vertices.Vertex;

public abstract class Shape {
	
	private Vertex vertex;
	
	public Shape(Vertex vertex) {
		this.setVertex(vertex);
	}
	
	public Vertex getVertex() {
		return this.vertex;
	}
	
	public void setVertex(Vertex vertex) {
		this.vertex = vertex;
	}
	
	@Override
	public String toString() {
		String shapeType = this.vertex.getClass().getSimpleName();
		return shapeType;
	}
}

