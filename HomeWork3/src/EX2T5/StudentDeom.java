package EX2T5;
/**
 * 
 * @author GR
 *
 */

import java.util.*;

public class StudentDeom {

	public static void main(String[] args) {
		
		int classA , classB , classC ;
		String name , type , flag ;
		UnderGraduate s1 ;
		Graduate s2 ;
		
		do{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������");
			name = sc.nextLine();
			
			System.out.print("ѧ�����ͣ�UG or G����");
			type = sc.nextLine();
			
			System.out.print("�ɼ�1:");
			classA = sc.nextInt();
			
			System.out.print("�ɼ�2:");
			classB = sc.nextInt();
			
			System.out.print("�ɼ�3:");
			classC = sc.nextInt();
			
			if(type.equals("UG")){
				s1 = new UnderGraduate(name, classA, classB, classC);
				s1.isPass();
			}
			else if(type.equals("G")){
				s2 = new Graduate(name, classA, classB, classC);
				s2.isPass();
			}
			
			System.out.print("Do you want to continue?(Y/N):");
			Scanner s = new Scanner(System.in);
			flag = s.nextLine();
			
		}while(flag.equals("Y")||flag.equals("y"));
		
	}

}
