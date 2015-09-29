package geometry;

import java.util.Arrays;
import java.util.Comparator;

import geometry.Classes.*;
import geometry.Classes.PlaneShapes.*;
import geometry.Classes.SpaceShapes.*;
import geometry.Interfaces.*;
import geometry.Vertices.Vertex;

public class GeometryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape triangle = new Triangle(
				new Vertex(1,2),
				new Vertex(3,4),
				new Vertex(5,6));
		Shape rectangle = new Rectangle(
				new Vertex(3,5),
				6,7);
		Shape circle = new Circle(
				new Vertex(5,2),
				8);
		Shape squarePyramid = new SquarePyramid(
				new Vertex(3,2,1),
				4,6);
		Shape cuboid = new Cuboid(
				new Vertex(1,4,7),
				4,2,1);
		Shape sphere = new Sphere(
				new Vertex(5,4,6),
				5);
		
		Shape[] shapes = new Shape[6];
		shapes[0] = triangle;
		shapes[1] = rectangle;
		shapes[2] = circle;
		shapes[3] = squarePyramid;
		shapes[4] = cuboid;
		shapes[5] = sphere;
		
        Arrays.stream(shapes)
	        .filter(shape -> shape instanceof VolumeMeasurable)
	        .map(shape -> ((VolumeMeasurable) shape))
	        .filter(shape -> shape.getVolume() > 40)
	        .forEach(shape -> System.out.println(shape));
        
        System.out.println();
        
        Arrays.stream(shapes)
        	.filter(shape -> shape instanceof PlaneShape)
        	.map(shape -> (PlaneShape) shape)
        	.sorted(Comparator.comparing(PlaneShape::getPerimeter))
        	.forEach(shape -> System.out.println(shape));
	}

}
