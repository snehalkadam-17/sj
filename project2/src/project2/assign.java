package project2;

import java.util.Scanner;

public class assign {
	public static void main(String[] args){

		 Scanner obj = new Scanner(System.in);
		    System.out.println("Enter quantity");
		    int x = obj.nextInt();
		    
		    if((x*100)>1000)
		    {
		    	System.out.println("ohhh");
		        System.out.println("You get a discount of "+(.1*x*100)+" and your total cost is "+(x*100-(.1*x*100)));
		    }
		   else
		   	{
			   System.out.println("no discount");
	        }
	}

}
