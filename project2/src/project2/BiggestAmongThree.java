package project2;
import java.util.*;
public class BiggestAmongThree {
 public static void main(String  args[]) {
	 Scanner sc=new Scanner (System.in);
	 System.out.print("Enter three Number");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 if(a>b) {
		 if(a>c) {
			 System.out.print(a);
		 }
		 else {
			 System.out.print(c);
		 }
	 }
	 else {
		 if(b>c) {
			 System.out.print(b);
		 }
		 else {
			 System.out.print(c);
		 }
	 }
 }
}
