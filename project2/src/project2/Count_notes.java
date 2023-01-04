package project2;
import java.util.Scanner;
	public class Count_notes {
		public static void main(String[]args)
		{
			int amt,r2000=0,r500=0,r100=0,r50=0,r20=0,r10=0,r5=0,r2=0,r1=0,count=0;
			System.out.println("enter the amount in rupees:\n\n");
			Scanner skill=new Scanner(System.in);
			amt=skill.nextInt();
			while(amt>=500)
			{
				r500=amt/500;
				amt=amt%500;
				System.out.println("\ntotal number of 500 rupees notes:"+500);
				break;
			}
			while(amt>=100)
			{
				r100=amt/100;
				amt=amt%100;
				System.out.println("\ntotal number of 100 rupees notes:"+100);
				break;
			}
			while(amt>=20)
			{
				r20=amt/20;
				amt=amt%20;
				System.out.println("\ntotal number of 20rupees notes:"+20);
				break;
			}
			while(amt>=10)
			{
				r10=amt/10;
				amt=amt%10;
				System.out.println("\ntotal number of 10rupees notes:"+10);
				break;
			}
			while(amt>=5)
			{
				r5=amt/5;
				amt=amt%5;
				System.out.println("\ntotal number of 5rupees notes:"+5);
				break;
			}
			while(amt>=2)
			{
			 r2=amt/2;
			 amt=amt%2;
			 System.out.println("\ntotal number of 2rupees notes:"+2);
				break;
			}
			while(amt>=1)
			{
				r1=amt/1;
				amt=amt%1;
				System.out.println("\ntotal number of 1rupees notes:"+1);
				break;
			}
			count=r500+r100+r20+r10+r5+r2+r1;
		}

	}


