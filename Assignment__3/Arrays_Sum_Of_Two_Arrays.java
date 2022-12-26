package Assignment_3;

/*

Take as input N, the size of array. Take N more inputs and store that in an array.
Take as input M, the size of second array and take M more inputs and store that in second array.
Write a function that returns the sum of two arrays. Print the value returned.

Input Format
Constraints
Length of Array should be between 1 and 1000.

Output Format
Sample Input
4
1 0 2 9
5
3 4 5 6 7
Sample Output
3, 5, 5, 9, 6, END
Explanation
Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6] and the first digit represents carry over , if any (0 here) .


*/


import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_Sum_Of_Two_Arrays {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] brr = new int[m];
        for(int i = 0 ; i < m ; i++){
            brr[i] = sc.nextInt();
        }

        sumOfTwoArrays(arr , brr);
    }

    static void sumOfTwoArrays(int[] arr , int[] brr){
        int i = arr.length - 1;
        int j = brr.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        while(i >= 0 && j >= 0){
            int s = arr[i--] + brr[j--] + c ;
            list.add(s%10);
            c = s / 10;
        }

        if(j == -1){
            while(i >= 0){
                int s = arr[i--] + c ;
                list.add(s%10);
                c = s / 10;
            }
        }
        else if(i == -1){
            while(j >= 0){
                int s = brr[j--] + c ;
                list.add(s%10);
                c = s / 10;
            }
        }
        if(c != 0)
            list.add(c);

        printList(list);
    }

    static void printList(ArrayList<Integer> list){
        for(int i = list.size()-1 ; i >= 0 ; i--){
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("END");
    }
}
