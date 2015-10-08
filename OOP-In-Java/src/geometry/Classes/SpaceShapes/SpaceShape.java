package geometry.Classes.SpaceShapes;

import java.util.List;

import geometry.Classes.Shape;
import geometry.Interfaces.*;
import geometry.Vertices.*;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
	

	public SpaceShape(List<Vertex> vertex) {
		super(vertex);
	}

	@Override
	public String toString() {
		String coordinates = String.format("Coordinates: [x = %.2d, y = %.2d, z = %.2d]", 
							this.getVertex().get(0).getX(),
							this.getVertex().get(0).getY(),
							this.getVertex().get(0).getZ());
		
		String area = String.format("Area: %.2f", 
									this.getArea());
		
		String volume = String.format("Volume: %.2f", 
									this.getVolume());
		
		return super.toString() + "\r\n" + coordinates + "\r\n" + area + "\r\n" + volume;
	}
}
