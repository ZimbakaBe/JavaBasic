package geometry.Classes.PlaneShapes;

import geometry.Vertices.Vertex;

public class Triangle extends PlaneShape {

	private Vertex secondVertex;
	private Vertex thirdVertex;
	
	public Triangle(Vertex vertex, Vertex secondVertex, Vertex thirdVertex) {
		super(vertex);
		this.setSecondVertex(secondVertex);
		this.setThirdVertex(thirdVertex);
	}

	public Vertex getSecondVertex() {
		return this.secondVertex;
	}
	
	public void setSecondVertex(Vertex secondVertex) {
		this.secondVertex = secondVertex;
	}
	
	public Vertex getThirdVertex() {
		return this.thirdVertex;
	}
	
	public void setThirdVertex(Vertex thirdVertex) {
		this.thirdVertex = thirdVertex;
	}
	
    @Override
    public double getArea() {
        double halfPerimeter = this.getPerimeter()/2;
        double sideA = this.getTriangleSide(this.getSecondVertex(), this.getThirdVertex());
        double sideB = this.getTriangleSide(this.getVertex(), this.getThirdVertex());
        double sideC = this.getTriangleSide(this.getVertex(), this.getSecondVertex());
        double area = Math.sqrt(
                halfPerimeter*
                (halfPerimeter - sideA)*
                (halfPerimeter - sideB)*
                (halfPerimeter - sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        double sideA = this.getTriangleSide(this.getSecondVertex(), this.getThirdVertex());
        double sideB = this.getTriangleSide(this.getVertex(), this.getThirdVertex());
        double sideC = this.getTriangleSide(this.getVertex(), this.getSecondVertex());
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    private double getTriangleSide(Vertex firstVertex, Vertex secondVertex) {
        double side = Math.sqrt(
                (Math.pow((firstVertex.getX() - firstVertex.getY()), 2) +
                (Math.pow((secondVertex.getX() - secondVertex.getY()), 2))));
        return side;
    }

}
