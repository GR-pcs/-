/**
 * 
 * @author GR
 * 
 */

package EX2T8;

public class Cylinder extends CircleLike implements Volume {
	
	double h ;
	
	public Cylinder(double r , double h) {
		super(r) ; 
		this.h = h ;
	}
	
	public double getSurface() {
		return h * perimeterCircle() + 2 * areaCircle() ;
	}
	
	public double getVolume(){
		return h * areaCircle() ;
	}
	
}
