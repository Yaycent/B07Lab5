package lab5;

import lab5.Point;

public class Circle {
    Point center;
    double radius; 
    
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public Boolean checkRange(Point P) {
        double distance = center.distance(P);
        if (distance <= radius) {
            return true;
        }else{
            return false;
        }
    }
}

