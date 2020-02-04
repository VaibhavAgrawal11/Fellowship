package basicCore;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int t=n;
		for (int i = 1; i <= t/2; i++) {
			if(isprime(i))
			{
				while(n%i==0) {
					al.add(i);
					n=n/i;
				}
			}
			
		}
		for (Integer in : al) {
			System.out.println(in);
		}
	}

	private static boolean isprime(int i) {
		if(i==1)
			return false;
		int n=2;
		while(n<i/2) {
			if(i%n==0)
				return false;
			n++;
		}
		return true;
	}

}
