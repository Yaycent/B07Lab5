package lab5;

public class circle {
    Point center;
    double radius; 
    
    public circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}


