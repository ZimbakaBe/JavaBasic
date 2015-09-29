package geometry.Classes.PlaneShapes;

import geometry.Vertices.Vertex;

public class Rectangle extends PlaneShape {

	private double width;
	private double height;
	
	public Rectangle(Vertex vertex, double width, double height) {
		super(vertex);
		this.setWidth(width);
		this.setHeight(height);
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

	@Override
	public double getArea() {
		double rectangleArea = this.height*this.width;
		return rectangleArea;
	}

	@Override
	public double getPerimeter() {
		double perimeter = (this.height*2) + (this.width*2);
		return perimeter;
	}


}
