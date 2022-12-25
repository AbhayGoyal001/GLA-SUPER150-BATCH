package Assignment_1;

/*
Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1
Input Format
Constraints
0 < N < 10

Output Format
Sample Input
4
Sample Output
1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1
*/

import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 2*n-3, star = 1, val = 1;
        int row = 1;

        while (row <= n){
            int col = 1;
            while (col <= star){
                val = col;
                System.out.print(val + " ");
                col++;
            }
            col = 1;
            while (col <= space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            while (col <= star){
                if(row==n && col==1){
                    System.out.print("");
                }
                else{
                    System.out.print(val + " ");
                }
                col++;
                val--;
            }

            star++;
            space-=2;
            row++;
            System.out.println();
        }
    }
}
