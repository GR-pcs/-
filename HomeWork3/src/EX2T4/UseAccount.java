/**
 * 
 * @author GR
 * 
 */

package EX2T4;

import java.util.Scanner;

public class UseAccount extends BankAccount {
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount() ;
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("�������");
		double money = sc.nextDouble() ;
		ba.put(money);
		
		System.out.print("����ȡ���") ;
		double getmoney = sc.nextDouble() ;
		System.out.println("���Ϊ��" + ba.get(getmoney));
		
		System.out.print("�������������ã�");
		double inter = sc.nextDouble() ;
		ba.setInterest(inter) ;
		
		System.out.println("����Ϊ��" + ba.getInterest());
		
	}
	
}
