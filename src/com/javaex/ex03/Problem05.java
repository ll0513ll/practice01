package com.javaex.ex03;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int result=0;
		int a = 0;
		
		System.out.println("숫자를 입력하세요.");
		
		for(int i=0;i<5;i++) {

			System.out.print("숫자 : ");
			a =sc.nextInt();
			if(result<a) {
				result=a;
			}
		}
		System.out.println("최대갑은 "+result+" 입니다.");
	}

}
