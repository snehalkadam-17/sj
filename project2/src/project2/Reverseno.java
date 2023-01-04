package project2;
import java.util.*;
public class Reverseno {
	public static void main(String[]args)
	{
		int j,n;
		Scanner obj=new Scanner(System.in);
	    System.out.println("enter the no");
		n=obj.nextInt();
		System.out.println("revers no");
		while(n>0)
		{
			j=n%10;
			System.out.print(j);
			n/=10;
		}
	}

	}

