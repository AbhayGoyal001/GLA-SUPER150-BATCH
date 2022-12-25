package Assignment_1;
/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

Input Format
Constraints
0 < N1 < 100 0 < N2 < 100

Output Format
Sample Input
10
4
Sample Output
5
11
14
17
23
26
29
35
38
41
Explanation
The output will've N1 terms which are not divisible by N2.
*/

import java.util.Scanner;

public class Print_Series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int c = 0;
        for(int i = 1 ; c != n1; i++){
            int t = 3*i + 2;
            if(t % n2 != 0){
                c++;
                System.out.println(t);
            }
        }
    }
}
