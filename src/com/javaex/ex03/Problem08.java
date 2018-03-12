package com.javaex.ex03;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		int result = 0;
		System.out.println("숫자를 입력하세요.");
		
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%2==1) {
			
			for(int i=1;i<=a;i++) {
				
				if(i%2==1) {
					result = result + i;
					
				}
			}
		}else {
			for(int i=1;i<=a;i++) {
				
				if(i%2==0) {
					result = result + i;
					
				}
			}
		}
		
			
		sc.close();
		System.out.println(result);
	}

}
