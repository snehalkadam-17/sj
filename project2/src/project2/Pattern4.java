package project2;
import java.util.*;
public class Pattern4 {
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0;
int b=0;
for(int x=1;x<=n;x++)
{
	for(int y=1;y<=x;y++) {
		System.out.print(a+"\t");
		int sum=a+b;
		a=b;
		b=sum;
	}
	System.out.println();
}
}
	}
