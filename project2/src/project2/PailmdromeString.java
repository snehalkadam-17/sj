package project2;
import java.util.*;
public class PailmdromeString {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String ");
	String n=sc.next();
	int l=n.length();
	String rev="";
	
	for(int x=0;x<l;x++) {
		rev=n.charAt(x)+rev;
	}
	if(rev.equalsIgnoreCase(n)) {
		System.out.println("palindrome String");
	}
	else {
		System.out.print("not palindrome String");
	}
}
}
