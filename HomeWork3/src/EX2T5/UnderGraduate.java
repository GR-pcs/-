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
			System.out.println("������" + super.getName() + "������ƽ����Ϊ" + super.getAverage() + "�������õ�ѧʿѧλ");
		else
			System.out.println("������" + super.getName() + "������ƽ����Ϊ" + super.getAverage() + "�������õ�ѧʿѧλ");
	}
	
}
