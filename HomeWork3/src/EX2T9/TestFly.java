/**
 * 
 * @author GR
 * 
 */

package EX2T9;

public class TestFly {
	
	static void makeFly(CanFly obj) {
		obj.fly() ;
	}
	
	public static void main(String[] args) {
		CanFly ca1 = new Plane() ;
		makeFly(ca1) ;
		
		CanFly ca2 = new Bird() ;
		makeFly(ca2) ;
	}
	
}
