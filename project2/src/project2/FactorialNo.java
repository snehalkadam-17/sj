package project2;
import java.util.*;
public class FactorialNo {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number");
	int n=sc.nextInt();
	int fact=1;
	while(n!=1)
	{
		fact=fact*n;
		n=n-1;
	}
	System.out.print(fact);
}
}
