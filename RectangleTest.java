package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectangleTest {
	
	@Test
	void test_area1() {
		Point A = new Point (0,0);
		Point B = new Point (3,4);
		Point C = new Point (3,0);
		Point D = new Point (0,4);
		
		Rectangle R= new Rectangle(A,B,C,D);
		
		assertEquals(12,R.Area());
	}
	@Test
	void test_area2() {
		Point A = new Point (0,0);
		Point B = new Point (3,0);
		Point C = new Point (3,4);
		Point D = new Point (0,4);
		
		Rectangle R= new Rectangle(A,B,C,D);
		
		assertEquals(12,R.Area());
	}
	
	@Test
	void test_area3() {
		Point A = new Point (3,0);
		Point B = new Point (0,0);
		Point C = new Point (3,4);
		Point D = new Point (0,4);
		
		Rectangle R= new Rectangle(A,B,C,D);
		
		assertEquals(12,R.Area());
	}
	
	@Test
	void test_Per1() {
		Point A = new Point (0,0);
		Point B = new Point (3,4);
		Point C = new Point (3,0);
		Point D = new Point (0,4);
		
		Rectangle R= new Rectangle(A,B,C,D);
		
		assertEquals(14,R.Perimeter());
	}
	
	@Test
	void test_Per2() {
		Point A = new Point (0,0);
		Point B = new Point (3,0);
		Point C = new Point (3,4);
		Point D = new Point (0,4);
		
		Rectangle R= new Rectangle(A,B,C,D);
		
		assertEquals(14,R.Perimeter());
	}
	
	@Test
	void test_Per3() {
		Point A = new Point (3,0);
		Point B = new Point (0,0);
		Point C = new Point (3,4);
		Point D = new Point (0,4);
		
		Rectangle R= new Rectangle(A,B,C,D);
		
		assertEquals(14,R.Perimeter());
	}
	

}
