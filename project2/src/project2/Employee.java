package project2;

import java.util.*;

public class Employee {
	public static void main(String[] args) {
		int year;
		int sal;
		double d;
		System.out.println("enter total years of servies==>");
		Scanner t=new Scanner(System.in);
		year=t.nextInt();
		if(year>5)
		{System.out.println("congrats...yes...!your total year of servies more than 5 years\n please enter your salary..>");
		sal=t.nextInt();
		System.out.println("your salary is..>"+sal);
		System.out.println("your net bonus with salary is..>"+(sal+(sal*0.05)));
		}
		else {System.out.println("No bonus");
	}
		
	}

	}


