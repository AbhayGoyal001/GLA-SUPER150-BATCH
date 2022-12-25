package Assignment_1;

import java.util.Scanner;

/*
Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.

Input Format
Single integer N.

Constraints
N <= 20

Output Format
Print pattern.

Sample Input
5
Sample Output
    *****
   *   *
  *   *
 *   *
*****
Explanation
For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.
*/
public class Hollow_Rhombus_Pattern {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = n, star = n;
        int row = 1;

        while (row <= n){
            int col = 1;
            while(col < space){
                System.out.print(" ");
                col++;
            }
            col = 1;
            while (col <= star){
                if (row==1 || col==1 || row==n || col==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

                col++;
            }
            row++;
            space--;
            System.out.println();
        }
    }
}
