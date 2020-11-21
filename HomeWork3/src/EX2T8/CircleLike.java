/**
 * 
 * @author GR
 * 
 */

package EX2T8 ;

public abstract class CircleLike {
	
	double r ;
	
	public CircleLike(double r) {
		this.r = r ;
	}
	
	public double areaCircle() {
		return Math.PI * Math.pow(r, 2) ;
	}
	
	public double perimeterCircle() {
		return 2 * Math.PI * r ;
	}
	
}
