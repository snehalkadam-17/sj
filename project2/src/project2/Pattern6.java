package project2;
import java.util.*;
public class Pattern6 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	{
		int n=sc.nextInt();
		int mult=1;
		for(int x=1;x<=10;x++)
		{
			mult=n*x;
			System.out.print(n+"*"+x+"="+mult);
		}
	}
}
}
