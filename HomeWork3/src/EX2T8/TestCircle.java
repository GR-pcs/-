package EX2T8;

public class TestCircle {

	public static void main(String[] args) {
		
		Cylinder cy = new Cylinder(2 , 10) ;
		
		System.out.println("表面积" + cy.getSurface());
		System.out.println("体积" + cy.getVolume());
		
	}

}
