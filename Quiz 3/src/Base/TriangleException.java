package Base;

public class TriangleException extends Exception {
	private Triangle t;
	public TriangleException(Triangle t) {
		this.t = t;
	}
	public Triangle getTriangle() {
		return t;
	}	
}

