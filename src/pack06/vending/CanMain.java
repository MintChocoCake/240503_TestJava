package pack06.vending;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Vanding canVanding = new Vanding();
		Vanding vand2 = new Vanding(6);
		
		boolean run = true;
		int money = 0;
		int canNum = 0;
		
		while (true) {
			System.out.print("투입할 금액 : ");
			money = Integer.parseInt(sc.nextLine());
			
			if (0 < money) {
				break;
			}
		}
		
		boolean IsAddMoney = false;
		int rechargeMoney = 0;
		boolean IsBuy = false;
		
		while (true) {
			canVanding.showCanMenu(money);
			System.out.println("현재 잔액 : " + money);
			System.out.println("[금액충전 : -1] [종료 : -2]");
			System.out.print("구입할 캔 번호 : ");
			canNum = Integer.parseInt(sc.nextLine());
			
			if (-1 == canNum) {
				IsAddMoney = true;
			} else if (-2 == canNum) {
				System.out.println("[종료]");
				break;
			} else {
				IsBuy = true;
			}
			
			while (IsAddMoney) {
				System.out.println("현재 잔액 : " + money);
				System.out.print("충전할 금액 : ");
				rechargeMoney = Integer.parseInt(sc.nextLine());
				
				if (0 > rechargeMoney) {
					System.out.println("[잘못된 입력]");
				} else {
					System.out.println("[" + rechargeMoney + "원 충전]");
					money += rechargeMoney;
					IsAddMoney = false;
				} // if else
			} // while2
			
			
			if (IsBuy) {
				money = canVanding.buyCan(canNum, money);
				IsBuy = false;
			}
			
			
		} // while1
		
		
		
		
	} // main

} // class
