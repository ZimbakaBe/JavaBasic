package geometry.Classes.SpaceShapes;

import geometry.Classes.Shape;
import geometry.Interfaces.*;
import geometry.Vertices.*;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
	
	public SpaceShape(Vertex vertex) {
		super(vertex);
	}
	
	public abstract double getArea();
	public abstract double getVolume();
	
	@Override
	public String toString() {
		String coordinates = String.format("Coordinates: [x = %.2f, y = %.2f, z = %.2f]", 
							this.getVertex().getX(),
							this.getVertex().getY(),
							this.getVertex().getZ());
		
		String area = String.format("Area: %.2f", 
									this.getArea());
		
		String volume = String.format("Volume: %.2f", 
									this.getVolume());
		
		return super.toString() + "\r\n" + coordinates + "\r\n" + area + "\r\n" + volume;
	}
}
