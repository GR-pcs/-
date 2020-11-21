/**
 * 
 * @author GR
 * 
 */

package EX2T6;

public final class Triangle extends LikeGraph {
	
	protected double side1 , side2 , side3 ;
	
	public Triangle(double side1 , double side2 , double side3) {
		super("triangle") ;
		this.side1 = side1 ;
		this.side2 = side2 ;
		this.side3 = side3 ;
	}
	
	
	
	public double area() {
		double p = (side1 + side2 + side3) / 2 ;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
	
	public double perimeter() {
		return side1 + side2 + side3 ;
	}
	
	public String toString() {
		return "The shape is: " + super.toString() + "\narea: " + area() + "\nPerimeter: " + perimeter();
	}
	
}
