package Assignment_3;

/*

Take as input a 2-d array. Print the 2-D array in spiral form anti-clockwise.

Input Format
Two integers M(row) and N(column) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 and 10.

Output Format
All M * N integers separated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END
Explanation
For spiral level anti-clockwise traversal, Go for first column-> last row ->last column-> first row and
then do the same traversal for the remaining matrix .

*/

import java.util.Scanner;

public class Arrays_Spiral_Print_Anticlockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();;
        int[][] arr = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printAntiClockWise(arr);
    }

    static void printAntiClockWise(int[][] arr){
        int row_start = 0;
        int col_start = 0;
        int row_end = arr.length - 1;
        int col_end = arr[0].length - 1;
        while (row_start <= row_end && col_start <= col_end){
            for(int i = row_start ; i <= row_end ; i++){
                System.out.print(arr[i][col_start] + " --> ");
            }
            col_start++;
            System.out.println();
            for(int i = col_start ; i <= col_end ; i++){
                System.out.print(arr[row_end][i] + " --> ");
            }
            row_end--;
            System.out.println();

            if(row_start <= row_end && col_start <= col_end) {
                for (int i = row_end; i >= row_start; i--) {
                    System.out.print(arr[i][col_end] + " --> ");
                }
                col_end--;
                System.out.println();

                for (int i = col_end; i >= col_start; i--) {
                    System.out.println(arr[row_start][i] + " --> ");
                }
                row_start++;
                System.out.println();
            }
        }

    }
}
