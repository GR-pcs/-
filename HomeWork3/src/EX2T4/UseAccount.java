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
		
		System.out.print("输入存款金额：");
		double money = sc.nextDouble() ;
		ba.put(money);
		
		System.out.print("输入取款金额：") ;
		double getmoney = sc.nextDouble() ;
		System.out.println("余额为：" + ba.get(getmoney));
		
		System.out.print("输入利率以设置：");
		double inter = sc.nextDouble() ;
		ba.setInterest(inter) ;
		
		System.out.println("利率为：" + ba.getInterest());
		
	}
	
}
