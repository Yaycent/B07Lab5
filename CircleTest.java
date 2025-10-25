package lab5;

import lab4.Point;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CircleTest {
    //Test perimeter(): verifies that the computed perimeter matches 2πr
    @Test
    void testPerimeter() {
        Point center = new Point(0, 0);
        Circle c = new Circle(center, 3.0);
        double expected = 2 * Math.PI * 3.0;
        assertEquals(expected, c.perimeter(), 0.0001);
    }
    //Test area(): verifies that the computed area matches πr^2
    @Test
    void testArea() {
        Point center = new Point(1, 1);
        Circle c = new Circle(center, 5.0);
        double expected = Math.PI * 5.0 * 5.0;
        assertEquals(expected, c.area(), 0.0001);
    }
    //Test getRadius: checks if the initial radius matches the constructor argument
    @Test
    void testGetRadius() {
        Point center = new Point(2, 2);
        Circle c = new Circle(center, 4.0);
        double expected = 4.0;
        assertEquals(expected, c.getRadius(), 0.0001);
    }
    //Test setRadius: verifies that the radius is correctly updated after calling setRadius()
    @Test
    void testSetRadius() {
        Point center = new Point(1, 2);
        Circle c = new Circle(center, 4.0);
        c.setRadius(1.0);
        assertEquals(1.0, c.getRadius(), 0.0001);
    }
    //Test checkRange(): should return true when the point is inside the circle
    @Test
    void testCheckRangeInside() {
        Point center = new Point(0, 0);
        Circle c = new Circle(center, 3.0);
        Point inside = new Point(1, 2);
        assertTrue(c.checkRange(inside));
    }
    //Test checkRange(): should return true when the point is exactly on the circle
    @Test
    void testCheckRangeOnCircle() {
        Point center = new Point(10, -5);
        Circle c = new Circle(center, 5.0);
        Point onCircle = new Point(10, 0); //Distance = 5.0
        assertTrue(c.checkRange(onCircle));
    }
    //Test checkRange(): should return false when the point is outside the circle
    @Test
    void testCheckRangeOutside() {
        Point center = new Point(-20, 10);
        Circle c = new Circle(center, 10.0);
        Point outside = new Point(-20, 21);
        assertFalse(c.checkRange(outside));
    }
}
