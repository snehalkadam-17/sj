//package project2;
//import java.util.*;
//public class Gcd {
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		int x;
//	
//		int small;
//		if(n1>n2) {
//			small=n2;
//		}
//		else {
//			small=n1;
//		}
//		for(int x=small;x>=2;x--)
//		{
//			if(n1%x==0 && n2%x==0) {
//				System.out.print(x);
//				break;
//			}
//		}
//		int m=2,lcm=1;
//		while(n1!=1 || n2!=1) {
//		if(n1%m==0 && n2%m==0)
//		{
//			lcm=lcm*m;
//			n1=n1/m;
//			n2=n2/m;
//			}
//		else if(n2%m==0) {
//			lcm=lcm*m;
//			n2=n2/m;
//		}
//		else {
//			m=m+1;
//		}
//	}
//	System.out.println(lcm);
//}
//}