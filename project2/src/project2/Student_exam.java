package project2;
import java.util.Scanner;
public class Student_exam 
{
	public static void main (String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of classes held: ");
		int x=sc.nextInt();
		System.out.println("enter number of classes attended: ");
		int y=sc.nextInt();
		float p;
		p=y*100.f/x;
		System.out.println("your total percentage attendance is " +p); 
		if(p>=75)
		{
			System.out.println("allowed");
		}
		else {
			System.out.println("not allowed");
		}
	}
	}
