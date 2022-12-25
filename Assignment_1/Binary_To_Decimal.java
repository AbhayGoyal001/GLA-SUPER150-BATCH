package Assignment_1;
/*
Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
101010
Sample Output
42
Explanation
For binary number fedcba , Decimal number = f * 2^5 + e * 2^4 + d * 2^3 + …..+ a * 2^0.
*/

import java.util.Scanner;

public class Binary_To_Decimal {
    public class Main {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; n > 0; i++) {
                int power_of_two = (int) Math.pow(2, i);
                sum += power_of_two * (n % 10);
                n = n / 10;
            }
            System.out.println(sum);
        }
    }
}