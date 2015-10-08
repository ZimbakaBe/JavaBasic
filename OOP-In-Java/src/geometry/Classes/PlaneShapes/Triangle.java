package geometry.Classes.PlaneShapes;

import java.util.List;

import geometry.Vertices.Vertex;

public class Triangle extends PlaneShape {


    public Triangle(List<Vertex> vertex) {
		super(vertex);
	}

	@Override
    public double getArea() {
        double halfPerimeter = this.getPerimeter()/2;
        double sideA = this.getTriangleSide(this.getVertex());
        double sideB = this.getTriangleSide(this.getVertex());
        double sideC = this.getTriangleSide(this.getVertex());
        double area = Math.sqrt(
                halfPerimeter*
                (halfPerimeter - sideA)*
                (halfPerimeter - sideB)*
                (halfPerimeter - sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        double sideA = this.getTriangleSide(this.getVertex());
        double sideB = this.getTriangleSide(this.getVertex());
        double sideC = this.getTriangleSide(this.getVertex());
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

}
