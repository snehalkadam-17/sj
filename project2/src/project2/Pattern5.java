package project2;
import java.util.*;
public class Pattern5 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int x=0;x<n;x++)
    {
    	int xf=1;
    	for(int ff=2;ff<x;ff++) {
    		xf=xf*ff;
    	}
    	for(int y=0;y<=x;y++)
    	{
    		int fac1=1;
    		int fac2=1;
    		for(int f=2;f<=y;f++)
    		{
    			fac1=fac1*f;
    		}
    		for(int f=2;f<=x-y;f++)
    		{
    			fac2=fac2*f;
    		}
    		int prt=xf/(fac1*fac2);
    		System.out.print(prt+"\t");
    	}
    	System.out.println();
    	
    }
}
}
