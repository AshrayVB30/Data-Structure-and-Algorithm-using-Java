package Module1;

import java.util.*;

public class gcdEuclids {
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find GCD of two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = gcd(a,b);
		System.out.print("GCD using Euclid's methos: "+t);
	}
}