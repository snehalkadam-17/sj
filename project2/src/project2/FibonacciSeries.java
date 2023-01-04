package project2;
import java.util.*;
public class FibonacciSeries {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int sum=0;
	for(int x=1;x<=10;x++) {
		if(x==1)
		{
			System.out.println(a+",");
		}
		else if(x==2)
		{
			System.out.println(b+",");
		}
		else
		{
			sum=a+b;
			if(x!=10) {
				System.out.print(sum+",");
			}
			else {
				System.out.println(sum);
			}
			a=b;
			b=sum;
		}
	}
}
}
