package project2;
import java.util.*;
public class YoungestOldest {
public static void main(String args[]) {
	int age1,age2,age3,max,min;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the age of first person:");
	age1=sc.nextInt();
	System.out.print("enter the age of Second person:");
	age2=sc.nextInt();
	System.out.print("Enter the age of third person11");
	age3=sc.nextInt();
	if(age1>age2 && age1>age3)
		System.out.print("First person is the oldest:");
	else if(age2>age1 && age2>age3)
		System.out.print("Second person is the oldest");
	else if(age3>age1 && age3>age2)
		System.out.print("Third person is the oldest");
	else {
		System.out.print("All have equal ages");
		System.exit(0);
	}
	if(age1<age2 && age1<age3)
		System.out.print("First Person is youngest");
	else if(age2<age1 && age2<age3)
		System.out.print("Second Person is the Youngest");
	else if(age3<age1 && age3<age2)
		System.out.print("Third person is the youngest");
	sc.close();
}
}
