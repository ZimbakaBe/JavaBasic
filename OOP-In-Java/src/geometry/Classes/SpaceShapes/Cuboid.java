package geometry.Classes.SpaceShapes;

import geometry.Vertices.Vertex;

public class Cuboid extends SpaceShape {
	
	private double width;
	private double height;
	private double depth;
	
	public Cuboid(Vertex vertex, double width, double height, double depth) {
		super(vertex);
		this.setWidth(width);
		this.setHeight(height);
		this.setDepth(depth);
	}

	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getDepth() {
		return this.depth;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	@Override
	public double getArea() {
		double cuboidArea = (2*this.width*this.height) + (2*this.width*this.depth) + (2*this.depth*this.height);
		return cuboidArea;
	}

	@Override
	public double getVolume() {
		double cuboidVolume = this.height*this.width*this.depth;
		return cuboidVolume;
	}
	
}
