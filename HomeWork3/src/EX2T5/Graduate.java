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
			System.out.println("�о���" + super.getName() + "������ƽ����Ϊ" + super.getAverage() + "�������õ�˶ʿѧλ");
		else
			System.out.println("�о���" + super.getName() + "������ƽ����Ϊ" + super.getAverage() + "�������õ�˶ʿѧλ");
	}
	
}
