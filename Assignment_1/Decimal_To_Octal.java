package Assignment_1;

/*
Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
63
Sample Output
77
Explanation
Both input and output are integers
*/

import java.util.Scanner;
public class Decimal_To_Octal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        intoBase(8 , n);
        // Your Code Here
    }
    static void intoBase(int destination_base , int n) {
        int sum = 0;
        int mul = 1;
        while(n > 0) {
            int rem = n%destination_base;
            sum += rem*mul;
            n = n / destination_base;
            mul *= 10;
        }
        System.out.println(sum);
    }
}
