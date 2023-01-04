package project2;
import java.util.*;
public class Array1 {
	public static void main(String[] args)
	{
		int[] a=new int[5];
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter 5 elments of array: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		for(int x:a) //for each loop
		{
			System.out.println(x);
		}
		
	}

}
