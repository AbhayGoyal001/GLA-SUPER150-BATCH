package Assignment_1;
/*
Take N (number of rows), print the following pattern (for N = 4)
0
1 1
2 3 5
8 13 21 34

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
4
Sample Output
0
1    1
2    3     5
8   13    21    34
Explanation
Each number is separated from other by a tab. For given input n, You need to print n(n+1)/2 fibonacci numbers.
Kth row contains , next k fibonacci numbers.

 */
import java.util.Scanner;

public class Fibonacci_Pattern_Pattern_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = 1, star = 1, a = 0, b = 1;

        while(row <= n){
            int col = 1;
            while(col <= star){
                int c = a + b;
                System.out.print(a + " ");
                a = b;
                b = c;
                col++;
            }
            System.out.println();
            star++;
            row++;
        }
    }
}
