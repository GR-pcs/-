package EX2T5;
/**
 * 
 * @author GR
 *
 */

class Graduate extends Student {
	
	public Graduate(String name , int classA , int classB , int classC){
		super(name, classA, classB, classC);
	}
	
	public void isPass(){
		if(super.getAverage() >= 80)
			System.out.println("研究生" + super.getName() + "的三科平均分为" + super.getAverage() + "，可以拿到硕士学位");
		else
			System.out.println("研究生" + super.getName() + "的三科平均分为" + super.getAverage() + "，不能拿到硕士学位");
	}
	
}
