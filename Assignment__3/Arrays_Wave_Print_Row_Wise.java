package Assignment_3;

import java.util.Scanner;

/*

Take as input a two-d array. Wave print it row-wise.

Input Format
Two integers M(row) and N(column) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers are seperated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END


*/
public class Arrays_Wave_Print_Row_Wise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printRowWave(arr);
    }

    static void printRowWave(int[][] arr){
        for(int row = 0 ; row < arr.length ; row++){
            if(row % 2 == 0){
                for(int col = 0 ; col < arr[0].length ; col++){
                    System.out.print(arr[row][col] + " --> ");
                }
            }
            else {
                for (int col = arr[0].length - 1 ; col >= 0 ; col--){
                    System.out.print(arr[row][col] + " --> ");
                }
            }
        }
        System.out.println("END");
    }
}
