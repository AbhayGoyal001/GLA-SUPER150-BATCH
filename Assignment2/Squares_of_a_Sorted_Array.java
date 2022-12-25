package Assignment_2;

import java.util.*;

/*

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number
sorted in non-decreasing order.

Input Format
First line of input contains an integer n representing the length of array n. Next line contains n array elements.

Constraints
1 <= nums.length <= 10^4
-10^4 <= nums[i] <= 10^4
nums is sorted in non-decreasing order.

Output Format
A sorted array representing squares of elements of nums array.

Sample Input
5
-4 -1 0 3 10
Sample Output
0 1 9 16 100
Explanation
After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100]

*/
public class Squares_of_a_Sorted_Array {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            arr[i] = x*x;
        }
        Arrays.sort(arr);

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
