package project2;
import java.util.*;
public class Palindromeno {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	boolean b=check_palindrome(n);
	if(b==true)
	{
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
public static boolean check_palindrome(int n)
{
	int temp=n;
	int rev=0;
	while(temp!=0)
	{
		int d=temp%10;
		rev=rev*10+d;
		temp=temp/10;
	}
	if(rev==n) {
		return true;
	}
	else {
		return false;
	}
}
}