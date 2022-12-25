package Assignment_1;
/*
Take N as input, Calculate it's reverse also Print the reverse.

Input Format
Constraints
0 <= N <= 1000000000

Output Format
Sample Input
123456789
Sample Output
987654321
Explanation
You've to calculate the reverse in a number, not just print the reverse.
*/
import java.util.Scanner;

public class Print_reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n > 0){
            int t = n % 10;
            rev = rev*10 + t;
            n = n/10;
        }
        System.out.println(rev);
        // Your Code Here
    }
}
