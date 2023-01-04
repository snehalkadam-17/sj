package project2;
import java.util.*;
public class Swap {
	public static void main(String[] args) {

		int a,b,temp;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of a and b=");
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("before swapping "+a+" "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping"+a+""+b);
	    System.out.println();
			
		}

	}

