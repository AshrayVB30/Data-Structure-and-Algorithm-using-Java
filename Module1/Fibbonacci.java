package Module1;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibbo(n);
        System.out.println();
    }

    static void fibbo(int x){
        int a=0, b=1;
        for (int i=0; i<x; i++){
            System.out.println(a+" ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
