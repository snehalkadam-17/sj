package project2;
import java.util.*;
public class Pattern10 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int x=1;x<=n;x++) {
		for(int y=n;y>=x;y--) {
			System.out.print("*\t");
		}
		System.out.println();
	}
}
}
