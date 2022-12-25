package Assignment_2;
/*

Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number.
Write a function which prints all pairs of numbers which sum to target.

Input Format
The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.

Constraints
Length of the arrays should be between 1 and 1000.

Output Format
Print all the pairs of numbers which sum to target. Print each pair in increasing order.

Sample Input
5
1
3
4
2
5
5
Sample Output
1 and 4
2 and 3
Explanation
Find any pair of elements in the array which has sum equal to target element and print them.

*/

import java.util.*;

public class Arrays_Target_Sum_Pairs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        sum(arr , n , target);
    }

    static void sum(int[] arr , int n , int t)
    {
        for(int i = 0 ; i < n; i++){
            // System.out.println(arr[i] + "-->" + i);
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] + arr[j] == t){
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}
