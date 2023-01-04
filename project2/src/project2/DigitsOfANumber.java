package project2;
import java.util.*;
public class DigitsOfANumber {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String sc1=Integer.toString(n);
	int I=sc1.length();
	int div=(int)(Math.pow(10,I-1));
	while(div!=0)
	{
		int d=n/div;
		System.out.print(d);
		n=n%div;
	}
}
}
