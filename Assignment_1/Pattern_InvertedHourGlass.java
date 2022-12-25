package Assignment_1;

/*
Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5
             5 4               4 5
             5 4 3           3 4 5
             5 4 3 2       2 3 4 5
             5 4 3 2 1   1 2 3 4 5
             5 4 3 2 1 0 1 2 3 4 5
             5 4 3 2 1   1 2 3 4 5
             5 4 3 2       2 3 4 5
             5 4 3           3 4 5
             5 4               4 5
             5                   5
Input Format
Take N as input.

Constraints
Output Format
Pattern should be printed with a space between every two values.

Sample Input
5
Sample Output
5                   5
5 4               4 5
5 4 3           3 4 5
5 4 3 2       2 3 4 5
5 4 3 2 1   1 2 3 4 5
5 4 3 2 1 0 1 2 3 4 5
5 4 3 2 1   1 2 3 4 5
5 4 3 2       2 3 4 5
5 4 3           3 4 5
5 4               4 5
5                   5
*/

import java.util.Scanner;

public class Pattern_InvertedHourGlass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = 1, star = 1, space = 2 * n - 1, val = 1;

        while(row <= 2 * n + 1){
            int col = 1;
            val = n;
            while(col <= star){
                System.out.print(val + " ");
                col++;
                val--;
            }
            col = 1;
            while(col <= space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            if(row <= n){
                val =  n - row + 1;
            }
            else if (row >= n){
                val = row - n - 1;
            }
            else {
                val = row - n;
            }

            while(col <= star){

                if(row == n+1 && col == 1){
                    System.out.print("");
                }
                else{
                    System.out.print(val + " ");
                }
                col++;
                val++;
            }
            System.out.println();
            if(row <= n){
                space -= 2;
                star++;
            }
            else {
                space += 2;
                star--;
            }
            row++;

        }
    }
}
