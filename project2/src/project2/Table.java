package project2;
import java.util.*;
public class Table {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	for(int x=1;x<=10;x++) 
	{
		System.out.println(n+"*"+x+"="+(n*x));
	}
}
}
