package EX2T5;
/**
 * 
 * @author GR
 *
 */

class Student {
	
	private String name ;
	private int classA , classB , classC ;
	
	public Student(String name , int classA ,int classB , int classC){
		this.name = name ;
		this.classA = classA ;
		this.classB = classB ;
		this.classC = classC ;
	}
	
	public String getName(){
		return name ;
	}
	
	public int getAverage(){
		return (classA + classB + classC) / 3 ;
	}
	
}
