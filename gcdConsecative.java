package Module1;

import java.util.Scanner;

public class gcdConsecative {
	public static int gcdC(int a, int b) {
		int gcd = Math.min(a, b);
		while (gcd > 1) {
			if (a % gcd == 0 && b % gcd == 0) {
				break;
			}
			gcd --;
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to find GCD: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("GCD using Consecative method: "+gcdC(num1, num2));
	}
}