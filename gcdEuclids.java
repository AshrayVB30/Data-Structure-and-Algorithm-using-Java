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


// Algorithm in Euclide's method:
// Step 1:Start
// Step 2:Take two variables(a, b)
// Step 3:Check b = 0 or not, if yes
//         print a is GCD, otherwise goto Step-4
// Step 4: a / b -> remainder(r)
// Step 5: a <- b, b <- r, goto Step-2
// Step 6:End
