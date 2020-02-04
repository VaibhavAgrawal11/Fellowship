package basicCore;

import java.util.Scanner;

public class HarmonicNumber {
	private static double harmonic(double n)
	{
		double k=0;
		double  j=1;
		while(j<=n)
		{
			k=k+1/j;
			j++;
		}
		return k;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		double n = sc.nextDouble();
		System.out.println(harmonic(n));
	}

}
