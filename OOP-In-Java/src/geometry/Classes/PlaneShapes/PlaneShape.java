package geometry.Classes.PlaneShapes;

import geometry.Classes.Shape;
import geometry.Interfaces.*;
import geometry.Vertices.Vertex;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

	public PlaneShape(Vertex vertex) {
		super(vertex);
	}
	
	public abstract double getPerimeter();
	public abstract double getArea();
	
	@Override
	public String toString() {
		String coordinates = String.format("Coordinates: [x = %.2f, y = %.2f]",
							this.getVertex().getX(),
							this.getVertex().getY());
		
		String area = String.format("Area: %.2f", this.getArea());
		String perimeter = String.format("Perimeter: %.2f", this.getPerimeter());
		
		return super.toString() + "\r\n" + coordinates + "\r\n" + area + "\r\n" + perimeter;
	}
}
