package project2;
import java.util.*;
public class ArmstrongNo {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number");
	int n=sc.nextInt();
	int temp=n;
	int sum=0;
	while(temp!=0)
	{
		int l=temp%10;
		sum=sum+(int)Math.pow(1, 3);
		temp=temp/10;
	}
	if(sum==n)
	{
		System.out.print("Armstrong number");
	}
	else {
		System.out.print("Not an Armstrong number");
	}
}
}
