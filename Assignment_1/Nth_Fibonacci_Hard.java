package Assignment_1;

import java.util.Scanner;

/*
Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

Input Format
Constraints
0 <= N <= 1000

Output Format
Sample Input
10
Sample Output
55
Explanation
The 0th fibonnaci is 0 and 1st fibonnaci is 1.
*/
public class Nth_Fibonacci_Hard {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Nth_fibo(n));
        // Your Code Here
    }

    static int Nth_fibo(int n){
        if(n < 2)
            return n+1;

        int a = 0;
        int b = 1;
        n = n-1;
        int c = 0;
        while(n-- > 0){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
