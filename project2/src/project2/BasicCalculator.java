package project2;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice\n1-Add\n2-Subtract\n3-Multiply\n4-Divide");
		int ch=sc.nextInt();
		System.out.print("enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(ch==1) {
			System.out.print(a+b);
		}
		else if(ch==2) {
			System.out.print(a-b);
		}
		else if(ch==3) {
			System.out.print(a*b);
		}
		else if(ch==4) {
			System.out.print(a/b);
		}
		else {
			System.out.print("Wrong error");
		}
	}

}
