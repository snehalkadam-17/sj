package project2;
import java.util.Scanner;
	public class shopcost {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the quentity:");
			double n=sc.nextDouble();
			if(n>1000) {
				System.out.println("the total cost="+(n-(n/100*10)));
			}
			else {
				System.out.println("The total cost="+n);
			}
		}

	}

