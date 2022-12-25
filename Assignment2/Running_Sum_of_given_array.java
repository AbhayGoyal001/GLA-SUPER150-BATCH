package Assignment_2;

import java.util.Scanner;

public class Running_Sum_of_given_array {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        runningSum(arr);
    }

    static void runningSum(int[] arr){
        System.out.print(arr[0] + " ");
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] += arr[i-1];
            System.out.print(arr[i] + " ");
        }

    }
}
