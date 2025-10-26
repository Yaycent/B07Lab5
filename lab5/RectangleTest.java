package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void RectangleABCDAreaTest() {
		Point A = new Point(0,0);
		Point B = new Point(0,2);
		Point C = new Point(3,2);
		Point D = new Point(3,0);
		Rectangle R = new Rectangle(A, B, C, D);
		
		assertEquals(R.Area(), 6);
	}
	
	@Test
	void RectangleACBDAreaTest() {
		Point A = new Point(0,0);
		Point B = new Point(2,3);
		Point C = new Point(2,0);
		Point D = new Point(0,3);
		Rectangle R = new Rectangle(A, B, C, D);
		
		assertEquals(R.Area(), 6);
	}
	
	@Test
	void RectangleADBCAreaTest() {
		Point A = new Point(0,0);
		Point D = new Point(2,3);
		Point C = new Point(2,0);
		Point B = new Point(0,3);
		Rectangle R = new Rectangle(A, B, C, D);
		
		assertEquals(R.Area(), 6);
	}
	
	@Test
	void NotRectangleTest() {
		Point A = new Point(0,0);
		Point B = new Point(0,4);
		Point C = new Point(3,2);
		Point D = new Point(3,0);
		assertThrows(IllegalArgumentException.class, () -> { new Rectangle(A, B, C, D); });
	}
	
	@Test
	void RectangleABCDPerimeterTest() {
		Point A = new Point(0,0);
		Point B = new Point(0,2);
		Point C = new Point(3,2);
		Point D = new Point(3,0);
		Rectangle R = new Rectangle(A, B, C, D);
		
		assertEquals(R.Perimeter(), 10);
	}
	
	@Test
	void RectangleACBDPerimeterTest() {
		Point A = new Point(0,0);
		Point B = new Point(2,3);
		Point C = new Point(2,0);
		Point D = new Point(0,3);
		Rectangle R = new Rectangle(A, B, C, D);
		
		assertEquals(R.Perimeter(), 10);
	}
	
	@Test
	void RectangleADBCPerimeterTest() {
		Point A = new Point(0,0);
		Point D = new Point(2,3);
		Point C = new Point(2,0);
		Point B = new Point(0,3);
		Rectangle R = new Rectangle(A, B, C, D);
		
		assertEquals(R.Perimeter(), 10);
	}

}
