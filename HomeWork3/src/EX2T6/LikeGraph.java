/**
 * 
 * @author GR
 * 
 */

package EX2T6;

public abstract class LikeGraph {
	
	protected String shape ;
	
	protected LikeGraph(String shape) {
		this.shape = shape ;
	}
	
	protected LikeGraph() {
		this("UnKnown-Shape") ;
	}
	
	public abstract double area() ;
	public abstract double perimeter() ;
	
	public String toString() {
		return shape ;
	}
	
}
