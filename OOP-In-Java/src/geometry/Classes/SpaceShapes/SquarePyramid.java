package geometry.Classes.SpaceShapes;

import geometry.Vertices.Vertex;

public class SquarePyramid extends SpaceShape {

	private double width;
	private double height;
	
	public SquarePyramid(Vertex vertex, double width, double height) {
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
		double squarePyramidArea = Math.pow(this.width, 2) + (2*(this.width*this.height));
		return squarePyramidArea;
	}

	@Override
	public double getVolume() {
		double squarePyramidVolume = (Math.pow(this.width, 2)*this.height)/3;
		return squarePyramidVolume;
	}

}
