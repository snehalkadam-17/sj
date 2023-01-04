package project2;
import java.util.*;
public class Pattern1 {
public static void main(String args[]) {
	Scanner scn=new Scanner(System.in);
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	
	for(int x=1;x<=n;x++) {
		for(int y=1;y<=x;y++) {
			System.out.println("*\t");
		}
		System.out.println();
	}
}
}
