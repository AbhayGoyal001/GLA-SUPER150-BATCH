package Assignment_3;

import java.util.Scanner;

/*

Given a square matrix, print its transpose.

Input Format
First line contains the N ,size of the square matrix. Next N lines contains N integers each denoting the elements of the matrix.

Constraints
1 <= N <= 10^3

Output Format
Print N lines each containing N elements. These are the elements of the new matrix.

Sample Input
5
1 46 4 60 100
28 52 97 80 59
6 33 62 42 12
57 31 56 89 47
1 50 73 53 99
Sample Output
1 28 6 57 1
46 52 33 31 50
4 97 62 56 73
60 80 42 89 53
100 59 12 47 99

*/
public class Transpose_of_a_square_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        display(arr);
        transposeMatrix(arr);
    }

    static void transposeMatrix(int[][] arr){
        int row = 0;
        while (row != arr.length){
            for (int i = row ; i < arr.length ; i++){
                int temp = arr[row][i];
                arr[row][i] = arr[i][row];
                arr[i][row] = temp;
            }
            row++;
        }
        display(arr);

    }

    static void display(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
