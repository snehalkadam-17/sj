package project2;
import java.util.*;
public class Odd {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number");
	int a=sc.nextInt();
	if(a%2==1) {
		System.out.print("odd");
	}
	else {
		System.out.println("even");
	}
}
}
