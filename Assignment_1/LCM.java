package Assignment_1;
/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which returns the LCM of N1 and N2. Print the value returned.

Input Format
Constraints
0 < N1 < 1000000000 0 < N2 < 1000000000

Output Format
Sample Input
4
6
Sample Output
12
Explanation
The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2.
*/

import java.util.Scanner;

public class LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        System.out.println(LCM(n1 , n2));

    }

    static long LCM(long n1 , long n2){
        long i = (long)Math.min(n1 , n2);
        long end = n1*n2;
        for(; i <= end ; i++){
            if(i%n1 == 0 && i%n2 == 0){
                return i;
            }
        }
        return i;
    }

}
