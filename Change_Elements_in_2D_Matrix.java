package Assignment_3;

import java.util.Scanner;

/*

Given a M x N matrix consisting of only 0 or 1, change all elements of row i and column j to 0 if cell (i, j) has value 0.
Do this without using any extra space for every (i, j) having value 0.

Input Format
Two integers M and N denoting number of rows and columns of the matrix
M * N elements of the matrix.

Constraints
0<=N<=50
0<=mat[i][j]<=1

Output Format
Formatted matrix.

Sample Input
5 5
1 1 0 1 1
1 1 1 1 1
1 1 1 0 1
1 1 1 1 1
0 1 1 1 1
Sample Output
0 0 0 0 0
0 1 0 0 1
0 0 0 0 0
0 1 0 0 1
0 0 0 0 0
Explanation
0’s are present at (0, 2), (4, 0), and (2, 3) in the input matrix. So, we change all elements of the following cells to 0.

row 0 and column 2
row 4 and column 0
row 2 and column 3

*/
public class Change_Elements_in_2D_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        convert(arr);
    }

    static void convert(int[][] arr){

        display(arr);

        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == 0){
                    set_negative_1(arr , i , j);
                }
            }
        }

        set_0(arr);
        display(arr);

    }

    static void set_negative_1(int[][] arr , int row , int col){

//        LEFT SIDE

        for(int i = col ; i >= 0 ; i--){
            if(arr[row][i] == 0){
                continue;
            }
            else{
                arr[row][i] = -1;
            }
        }

//            RIGHT SIDE

        for (int i = col ; i < arr[row].length ; i++){
            if(arr[row][i] == 0){
                continue;
            }
            else{
                arr[row][i] = -1;
            }
        }

//        TOP SIDE

        for (int i = row ; i >= 0 ; i--){
            if(arr[i][col] == 0){
                continue;
            }
            else{
                arr[i][col] = -1;
            }
        }

//        BOTTOM SIDE
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i][col] == 0){
                continue;
            }
            else{
                arr[i][col] = -1;
            }
        }
    }

    static void set_0(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    static void display(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
