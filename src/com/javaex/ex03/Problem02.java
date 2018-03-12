package com.javaex.ex03;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.");
	
		Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	 
	 for(int a=1;a<=num;a++) {
		 
		 for(int b=2;b<=a;b++) {
			 
			 System.out.print(a);
		 }
		 System.out.println(a);
		 
	 }
	 sc.close();
	}

}
