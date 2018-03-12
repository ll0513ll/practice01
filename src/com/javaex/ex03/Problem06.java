package com.javaex.ex03;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		boolean ck = true;
		int coin=1000;//단위(만원)
		
		while(ck) {
			System.out.println("---------------------------");
			System.out.println("1:예금 | 2:출금 | 3:잔고 | 4:종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			int num=sc.nextInt();
			
//			if (num == 1) {
//				System.out.print("예금액:");
//				in=sc.nextInt();
//				coin=coin+in;
//			} else if (num == 2) {
//				System.out.print("출금액:");
//				out=sc.nextInt();
//				coin=coin+in-out;
//			} else if (num == 3) {
//				System.out.println("잔액: "+coin);
//			} else if (num == 4) {
//				System.out.print("프로그램 종료");
//				ck = false;
//			}else {
//				System.out.println("다시 입력해 주세요.");
//			}
//			
			
			switch(num) {
			
			case 1:
				System.out.print("예금액: ");
				coin=coin+sc.nextInt();
			    break;
			case 2:
				System.out.print("출금액: ");
				coin=coin-sc.nextInt();
			    break;
			case 3:
				System.out.println("잔액 : "+coin);
				break;
			case 4:
				System.out.println("프로그램 종료");
				ck=false;
				break;
			default :
				System.out.println("다시 입력해 주세요.");
				break;
			}
			
			
		}
	}
}

