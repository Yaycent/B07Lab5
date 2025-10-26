

；
public class Rectangle {
	// 4 vertices of a rectangle
	Point A;
	Point B;
	Point C;
	Point D;
	
	// rectangle checker
	private boolean isRectangle (Point A, Point B, Point C, Point D) {
		// find the coordinates of the center of the circumcircle of ABCD
		double centermassx = (A.x+B.x+C.x+D.x)/4;
		double centermassy = (A.y+B.y+C.y+D.y)/4;
		Point centermass = new Point(centermassx,centermassy);
		
		// find the distance from the center to each vertices
		double dA = centermass.distance(A);
		double dB = centermass.distance(B);
		double dC = centermass.distance(C);
		double dD = centermass.distance(D);
		
		// if the distance from the center of the circle to each vertex (corner) is the same,
		// ABCD is a rectangle
		if (dA==dB && dC==dD) {
			return true;
		}
		return false;
	}
	// constructor
	public Rectangle(Point A, Point B, Point C, Point D) throws IllegalArgumentException {
		if (isRectangle(A, B, C, D)) {
			this.A = A;
			this.B = B;
			this.C = C;
			this.D = D;
		}
		else throw new IllegalArgumentException("The points do not form a rectangle");
	}
	// area method
	public double Area() {
		double ab = A.distance(B);
		double ac = A.distance(C);
		double bc = B.distance(C);
		// if one side is the hypotenuse in the triangle ABC of the rectangle ABCD, other two are length and width
		if (ab>ac && ab>bc) {
			return ac*bc;
		}
		else if (ac>bc && ac>ab) {
			return bc*ab;
		}
		else return ab*ac;
		
	}
	
	// perimeter method
	public double Perimeter() {
		double ab = A.distance(B);
		double ac = A.distance(C);
		double bc = B.distance(C);
		if (ab>ac && ab>bc) {
			return 2*(ac+bc);
		}
		else if (ac>bc && ac>ab) {
			return 2*(bc+ab);
		}
		else return 2*(ab+ac);
	}
}
