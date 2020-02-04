package basicCore;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int n=sc.nextInt();
		double i=0,h=0,t=0;
		while(i<n) {
			double r =Math.random();
			if(r<=0.5)
			{
				System.out.println("Heads");
				h++;
			}
			else
			{
				System.out.println("Tails");
				t++;
			}
			i++;
		}
		System.out.println("Percentage of heads: "+ h/n*100);
		System.out.println("Percentage of tails: "+ t/n*100);

	}

}
