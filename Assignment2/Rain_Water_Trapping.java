package Assignment_2;

/*

You are given an input array whose each element represents the height of a line towers. The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. You need to find how much water filled between these given towers.

Example : IMAGE :- https://i.imgur.com/m4hyHPw.png

Input Format
The first line consists of number of test cases T. Each test case consists an integer N as number of towers and next line contains the N space separated integers.

Constraints
1 <= N <= 1000000 1 <= t <= 10 0 <= A[i] <= 10000000

Output Format
Print how much unit of water collected among towers for each test case.

Sample Input
2
6
3  0  0  2  0  4
12
0  1  0  2  1  0  1  3  2  1  2  1
Sample Output
10
6

*/

import java.util.Scanner;

public class Rain_Water_Trapping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            int[] leftMaximum = new int[n];
            leftMaximum[0] = arr[0];
            for(int i = 1 ; i < n ; i++){
                leftMaximum[i] = Math.max(arr[i] , leftMaximum[i-1]);
            }

            int[] rightMaximum = new int[n];
            rightMaximum[n-1] = arr[n-1];
            for(int i = n-2 ; i >=0 ; i--){
                rightMaximum[i] = Math.max(rightMaximum[i+1] , arr[i]);
            }

            int trappedRainWater = 0;
            for(int i = 0 ; i < n ; i++){
                trappedRainWater += Math.min(rightMaximum[i] , leftMaximum[i]) - arr[i];
            }

            System.out.println(trappedRainWater);
        }
    }
}
