package Assignment_1;

/*
Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.

Input Format
The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.

Constraints
N<=1000 Digits in binary representation is <=16.

Output Format
N lines,each containing a decimal equivalent of the binary number.

Sample Input
4
101
1111
00110
111111
Sample Output
5
15
6
63
Explanation
For binary number fedcba , Decimal number = f * 2^5 + e * 2^4 + d * 2^3 + …..+ a * 2^0.
*/

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            intoBinary(n);
        }
    }

    static void intoBinary(int n){
        int sum = 0;
        for(int i = 0 ; n > 0 ; i++){
            int power_of_two = (int) Math.pow(2,i);
            sum += power_of_two*(n%10);
            n = n/10;
        }
        System.out.println(sum);
    }
}
