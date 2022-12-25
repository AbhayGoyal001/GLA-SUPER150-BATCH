package Assignment_1;

import java.util.Scanner;

/*
You will be given a number N. You have to code a hollow diamond looking pattern.

*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********

The output for N=5 is given in the following image.


Input Format
The input has only one single integer N.

Constraints
Output Format
Output the given pattern.

Sample Input
Sample Output
Explanation
Write a code to print above given pattern. No space between any two characters.
*/
public class Pattern_Magic {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 1, star = n;
        int row = 1;

        while (row <= 2*n-1){
            int col = 1;
            while(col <= star){
                System.out.print("*");
                col++;
            }
            col=1;
            while (col <= space){
                if (row > 1){
                    System.out.print(" ");
                }
                col++;
            }
            col = 1;
            while(col <= star){
                if(row==1 && col==star || row==2*n-1 && col==star){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                col++;
            }

            if(row < n){
                star--;
                if(row > 1){
                    space+=2;
                }
            }
            else {
                star++;
                if(row > 1){
                    space-=2;
                }
            }
            row++;
            System.out.println();
        }
    }
}
