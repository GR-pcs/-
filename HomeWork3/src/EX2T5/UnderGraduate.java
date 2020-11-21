package EX2T5;
/**
 * 
 * @author GR
 *
 */

class UnderGraduate extends Student {
	
	public UnderGraduate(String name , int classA , int classB , int classC){
		super(name, classA, classB, classC);
	}
	
	public void isPass(){
		if(super.getAverage() >= 60)
			System.out.println("本科生" + super.getName() + "的三科平均分为" + super.getAverage() + "，可以拿到学士学位");
		else
			System.out.println("本科生" + super.getName() + "的三科平均分为" + super.getAverage() + "，不能拿到学士学位");
	}
	
}
