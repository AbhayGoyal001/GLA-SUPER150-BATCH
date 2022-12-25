package Assignment_2;
/*

Take as input N, a number. Take N more inputs to form an array.
The array contains only 0 and 1. Sort the array in a single scan.

Input Format
Enter the size of the array N and input N more numbers and store in the array

Constraints
Output Format
Display the sorted array

Sample Input
5
1
1
1
0
0
Sample Output
0 0 1 1 1

*/

import java.util.Scanner;

public class Sort_0_and_1_Time_Complexity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n  ; i++){
            arr[i] = sc.nextInt();
        }
        sortInOneScan(arr , n);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void sortInOneScan(int[] arr , int n)
    {
        int s = 0;
        int e = n-1;
        while(s < e){
            if(arr[s] == 1){
                if(arr[e] == 0){
                    int t = arr[s];
                    arr[s] = arr[e];
                    arr[e] = t;
                }
                else{
                    e--;
                }
            }
            else{
                s++;
            }
        }
    }
}
