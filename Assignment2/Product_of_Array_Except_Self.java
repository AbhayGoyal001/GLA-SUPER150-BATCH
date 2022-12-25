package Assignment_2;

/*

Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the
elements of arr except arr[i].

Input Format
First line contains integer N as size of array.
Next line contains a N integer as element of array.

Constraints
arr[i]<=10000000

Output Format
print output array

Sample Input
4
1 2 3 4
Sample Output
24 12 8 6

*/

import java.util.Scanner;

public class Product_of_Array_Except_Self {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        productOfArrayExceptItself(arr);
    }

    static void productOfArrayExceptItself(int[] nums){
        long mul=1;
        long[] answer = new long[nums.length];

        for(int i=0;i<nums.length;i++) {
            answer[i] = mul;
            mul*=nums[i];
        }
        mul=1;
        for(int i=nums.length-1;i>=0;i--) {
            answer[i] = answer[i]*mul;
            mul*=nums[i];
        }
        display(answer);

    }

    static void display(long[] arr){
        for(int i = 0 ; i < arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
