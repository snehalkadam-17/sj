package project2;
import java.util.*;
public class RotateNumber {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int k=sc.nextInt();
	
	String ns=Integer.toString(n);
	int len=ns.length();
	
	if(k>len)
	{
		k=k%len;
	}
	
	if(k==0)
	{
		System.out.println(n);
	}
	
	else if(k>0)
	{
		for(int x=1;x<=k;x++)
		{
			int d=n%10;
			n=n/10;
			n=d*(int)Math.pow(10, len-1)+n;
		}
		System.out.println(n);
	}
	
	else
	{
		k=k*(-1);
		for(int x=1;x<=k;x++)
		{
			int div=(int)Math.pow(10,len);
			int d=n/div;
			d=n%div;
			n=n*10+d;
		}
		System.out.println(n);
	}
}
}