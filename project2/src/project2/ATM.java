package project2;
import java.util.*;
	public class ATM 
	{
	public static void main(String[] args)
	{
		int balance=10000,withdraw,deposit;
		Scanner obj = new Scanner(System.in);
		while(true)
		{
			System.out.println("Automated Teller machine");
			System.out.println("1 to withdraw");
			System.out.println("2 to deposit");
			System.out.println("3 to check balance");
			System.out.println("4 to EXIT");
			System.out.println("choose the option to continue:");
			
			int choice =obj.nextInt();
			switch(choice)
			{
			case 1:
			   System.out.println("enter money to be withdrawn:");
			   withdraw=obj.nextInt();
			   
			   if(balance >= withdraw)
			   {
				   balance= balance - withdraw;
				   System.out.println("please collect your money");
			   }
			   else
			   {
				   System.out.println("Insufficient balance");
			   }
				   break;
			case 2:
				System.out.println("enter money to be deposited:");
				deposit =obj.nextInt();
					balance=balance + deposit;
				System.out.println("your money has been successfully deposited");
				break;
				
			case 3:
				System.out.println("balance : "+balance);
				break;
			}
}
}
}	
