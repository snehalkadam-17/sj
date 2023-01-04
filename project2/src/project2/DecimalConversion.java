//package project2;
//import java.util.*;
//public class DecimalConversion { 
//	 public static void main(String[] args) {
//	 Scanner scn = new Scanner(System.in);
//	 int n = scn.nextInt();
//	 int sourceBase = scn.nextInt();
//	 int destBase= scn.nextInt();
//	 int decimal=source To Decimal(n,sourceBase);
//	 int dest=decimal To Dest(decimal,destBase);
//	 System.out.println(dest);
//	 } 
//	 //Converting number from source base to decimal
//	 public static int sourceToDecimal(int n,int b)
//	 {
//	 int i=1;
//	 int sum=0;
//	 while(n!=0)
//	 {
//	 int r=n%10;
//	 int add=r*i;
//	 sum=sum+add;
//	 i=i*b;
//	 n=n/10;
//	 }
//	 return sum;
//	 }
//	 public static int DecimalTodest(int n,int b)
//	 {
//		 int i=1;
//		 int sum=0;
//		 while(n!=0)
//		 {
//			 int r=n%b;
//			 int add=r*i;
//			 sum=sum+add;
//			 i=i*10;
//			 n=n/b;
//		 }
//		 return sum;
//	 }
//}
//
