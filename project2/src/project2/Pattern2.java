package project2;
import java.util.*;
public class Pattern2 {
public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);{
		int n=sc.nextInt();
		int p1=n/2,p2=n/2;
		
		for(int x=1;x<=n;x++) {
			for(int y=0;y<=n;y++) {
				if(y==p1 || y==p2) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}	
			}
			System.out.println();
			if(x>=(n/2+1)) {
				p1--;
				p2++;
			}
			else {
				p1++;
				p2--;
			}
		}
	}
}
}
