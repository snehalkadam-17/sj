package project2;
import java.util.*;
public class PrimeNumberBetween1to100 {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	int t=sc.nextInt();
	int flag=0;
	for(int x=1;x<=t;x++) {
		flag=0;
		int n=sc.nextInt();
		for(int y=1;y<=n;y++)
		{
			if(n%y==0) {
				System.out.println("not primeno");
				flag=1;
				break;
			}
			}
		if(flag==0) {
			System.out.println("prime no");
		}
		}
}
}
