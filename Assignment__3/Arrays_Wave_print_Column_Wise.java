package Assignment_3;

import java.util.Scanner;

/*

Take as input a two-d array. Wave print it column-wise.

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
11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END


*/
public class Arrays_Wave_print_Column_Wise {
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
        printColWave(arr);
    }

    static void printColWave(int[][] arr){
        for(int col = 0 ; col < arr[0].length ; col++){
            if(col % 2 == 0){
                for(int row = 0 ; row < arr.length ; row++){
                    System.out.print(arr[row][col] + " --> ");
                }
            }
            else {
                for(int row = arr.length - 1 ; row >= 0 ; row--){
                    System.out.print(arr[row][col] + " --> ");
                }
            }
        }
        System.out.println("END");
    }
}
