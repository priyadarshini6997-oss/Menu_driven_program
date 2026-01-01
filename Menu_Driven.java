package com.index;

import java.util.Scanner;

public class Menu_Driven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		int a=0;
		int b=0;
		do {
			System.out.println("----MENUE----");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Exist");
			System.out.println("Enter the Choice");
			choice=sc.nextInt();
			if(choice==1||choice==2) {
				System.out.println("Enter First Number:");
				a=sc.nextInt();
				System.out.println("Enter Second Number: ");
				b=sc.nextInt();
			}
			if(choice==1) {
				System.out.println("Result: "+(a+b));
			}else if(choice==2) {
				System.out.println("Result: "+(a-b));
			}else if(choice==3) {
				System.out.println("Exist");
			}else {
				System.out.println("Invalid choice");
			}
		}while(choice!=3);
		sc.close();
	}

}
