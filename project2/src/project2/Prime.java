package project2;
import java.util.*;
public class Prime {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number");
int n=sc.nextInt();
int flag=0;
for(int x=2;x<n/2;x++) {
	if(n%x==0) {
	System.out.println("not a prime number");
	flag=1;
	break;
	}
}
if(flag==0) {
	System.out.print("prime number");
}
}
}
