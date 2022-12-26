package Assignment_3;

import java.util.Scanner;

/*


Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.

Input Format
First line contains a single integer N. Next N lines contain N space separated integers.

Constraints
N < 1000

Output Format
Print N lines with N space separated integers of the rotated array.

Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output
4 8 12 16
3 7 11 15
2 6 10 14
1 5 9 13
Explanation
Rotate the array 90 degrees anticlockwise.


*/
public class Rotate_Image {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        rotateAntiClockWise(arr);
    }

    static void rotateClockWise(int[][] arr){
        transposeMatrix(arr);
        System.out.println("MATRIX AFTER TRANSPOSE :-> ");
        display(arr);
        for(int[] i : arr){
            rotate(i);
        }
        System.out.println("MATRIX AFTER ROTATE CLOCKWISE :-> ");
        display(arr);
    }
    static void rotateAntiClockWise(int[][] arr){
        for (int[] i : arr){
            rotate(i);
        }
        System.out.println("MATRIX AFTER REVERSING ROWS");
        display(arr);
        transposeMatrix(arr);
        System.out.println("MATRIX AFTER ROTATING ANTICLOCKWISE");
        display(arr);
    }

    static void rotate(int[] arr){
        int s = 0 ;
        int e = arr.length - 1;
        while (s < e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;

            s++;
            e--;
        }
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
//        display(arr);
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
