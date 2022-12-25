package Assignment_2;

/*

You are given an integer n. Find the square root of the number.

Input Format
An integer T, denoting the number of test cases. Each test case contains an integer N.

Constraints
1<=T<=10^5 1<=N<=10^12

Output Format
Output a floating point number which is square root of the integer N.
(Note: Print the answer upto 4 decimal places only).

Sample Input
2
100
1000
Sample Output
10.0000
31.6227
Explanation
In first test case, (10.0000)(10.0000)=100=n* and hence 10.0000 is the square root of n.

*/

import java.util.Scanner;

public class SQUARE_ROOT {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while(t-->0){

            long n = cin.nextLong();
            long lower = 1;
            long higher = n;
            long ans = 0;
            while(lower<=higher){

                long mid =lower + (higher-lower)/2;
                if(mid*mid <= n){
                    ans = mid;
                    lower = mid + 1;
                }else{
                    higher = mid - 1;
                }

            }

            double num = getFullNumber(ans , n);
            System.out.println(String.format("%.4f" , num));

        }
        cin.close();

    }

    public static double getFullNumber(long a , long n){

        double add = 0.1;
        double Answer = a;
        for(int i=1;i<=4;i++){

            while(Answer * Answer <=n){
                Answer += add;
            }

            Answer -= add;
            add/=10;
        }

        return Answer;
    }
}
