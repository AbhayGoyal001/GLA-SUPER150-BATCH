package Assignment_3;

import java.util.Scanner;

/*

You are provided an array of numbers. You need to arrange them in a way that yields the largest value.

Input Format
First line contains integer t which is number of test case.
For each test case, you are given a single integer n in the first line which is the size of array A[] and next line contains n
space separated integers denoting the elements of the array A .

Constraints
1<=t<=100

1<=m<=100

1<=A[i]<=10^5

Output Format
Print the largest value.

Sample Input
1
4
54 546 548 60
Sample Output
6054854654
Explanation
Upon rearranging the elements of the array , 6054854654 is the largest possible number that can be generated.

*/
public class Form_Biggest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int m = sc.nextInt();
            String[] st = new String[m];
            for (int i = 0 ; i < m ; i++){
                st[i] = sc.next();
            }
            formBiggestNumber(st);
        }
    }

    static void formBiggestNumber(String[] arr){
        String Bigger_Number = "";
        for(int i = 0 ; i < arr.length ; i++){
            Bigger_Number = Compare(Bigger_Number , arr[i]);
        }
        System.out.println(Bigger_Number);
    }

    static String Compare(String s1 , String s2){

        String bigger = "";
        if(s1.compareTo(s2) > 0){
            bigger = s1 + s2;
        }
        else {
            bigger = s2 + s1;
        }
        return bigger;
    }
}
