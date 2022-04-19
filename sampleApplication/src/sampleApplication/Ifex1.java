package sampleApplication;
import java.util.Scanner;
public class Ifex1 {
	// accept two number, find which big 

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any two values");
		int x = scn.nextInt();
		int y = scn.nextInt();
		if (x>y) 
			System.out.println("first number is big");
		else
			System.out.println("second number is big");
	}

}
