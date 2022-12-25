package Assignment_1;


/*
Take sb (source number system base), db (destination number system base) and sn (number in source format).
Write a function that converts sn to its counterpart in destination number system. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
8
2
33
Sample Output
11011
Explanation
All input output is as integers and in separate lines.
*/
import java.util.Scanner;

public class Conversion_Any_To_Any {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n = sc.nextInt();
        int num = n;

        int rem, dec = 0, i = 0;

        while (num > 0){
            rem = num % 10;
            dec = dec + rem * (int)Math.pow(n1,i);
            num /= 10;
            i++;
        }

        num = dec;
        String new_sys = "";

        while (num > 0){
            rem = num % n2;
            new_sys = Integer.toString(rem) + new_sys;
            num /= n2;
        }

        System.out.println(Integer.parseInt(new_sys));

    }
}
