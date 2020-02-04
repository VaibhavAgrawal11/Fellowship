package basicCore;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year in 4 digits");
		int y = sc.nextInt();
		if(y>=1582)
		{
			if(y%400==0 ||(y%4==0 && y%100!=0))
			{
				System.out.println("Leap Year");
			}
			else
				System.out.println("Not ");
		}
		else
			System.out.println("Invalid Input");
	}

}
