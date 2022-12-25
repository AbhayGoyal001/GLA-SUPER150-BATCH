package Assignment_1;

import java.util.Scanner;

/*
Take N as input. For a value of N=5, we wish to draw the following pattern :

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4
                              3 2 1 0 1 2 3
                                2 1 0 1 2
                                  1 0 1
                                    0
                                  1 0 1
                                2 1 0 1 2
                              3 2 1 0 1 2 3
                            4 3 2 1 0 1 2 3 4
                          5 4 3 2 1 0 1 2 3 4 5
Input Format
Take N as input.

Constraints
N <= 20

Output Format
Pattern should be printed with a space between every two values.

Sample Input
5
Sample Output
 5 4 3 2 1 0 1 2 3 4 5
   4 3 2 1 0 1 2 3 4
     3 2 1 0 1 2 3
       2 1 0 1 2
         1 0 1
           0
         1 0 1
       2 1 0 1 2
     3 2 1 0 1 2 3
   4 3 2 1 0 1 2 3 4
 5 4 3 2 1 0 1 2 3 4 5
*/
public class Pattern_HourGlass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1, space = 1, star = n, val = n;

        while(row <= 2*n +1){
            int col = 1;
            while(col < space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            if(row <= n){
                val = n - row + 1;
            }
            else{
                val = row - n - 1;
            }
            while(col <= star+1){
                System.out.print(val + " ");
                col++;
                val--;

            }
            col = 1;
            val = 1;
            while(col <= star){
                System.out.print(val + " ");
                col++;
                val++;

            }
            System.out.println();
            if(row <= n){
                star--;
                space++;
            }
            else{
                star++;
                space--;
            }

            row++;
        }


    }
}
