package geometry.Vertices;

public class Vertex {
	private int x;
	private int y;
	private int z;
	
	public Vertex(int x, int y, int z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}
	
	public Vertex(int x, int y) {
		this(x,y,0);
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y)	{
		this.y = y;
	}
	
	public int getZ() {
		return this.z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
}
