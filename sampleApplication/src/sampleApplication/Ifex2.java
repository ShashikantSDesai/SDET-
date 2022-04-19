package sampleApplication;
import java.util.Scanner;
public class Ifex2 {
	// accept 3 number,find which big

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 3 number");
		int x = scn.nextInt();  //10
		int y = scn.nextInt();  //5
		int z = scn.nextInt();  //4
		
		if(x>y&&x>z)
			System.out.println("first number big ");
		else if (y>x&&y>z) 
			System.out.println("second number big ");
		else if (z>x&&z>y) 
			System.out.println("third number big ");
		else
			System.out.println("any two values might be same");
	}

}
