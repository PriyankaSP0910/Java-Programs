package shapes;
public class Circle {
    private int radius=3;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
    	return 3.142 * this.radius * this.radius;
        
    }
}