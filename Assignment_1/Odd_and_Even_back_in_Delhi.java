package Assignment_1;

import java.util.Scanner;

/*
Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?

Input Format
The first line contains N , then N integers follow each denoting the number of the car.

Constraints
N<=1000 Car No >=0 && Car No <=1000000000

Output Format
N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !

Sample Input
2
12345
12134
Sample Output
Yes
No
Explanation
1 + 3 + 5 = 9 which is divisible by 3
1 + 1 + 3 = 5 which is NOT divisible by 3 and 2+4 = 6 which is not divisble by 4.
*/
public class Odd_and_Even_back_in_Delhi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int sum_of_odd_digits = 0;
            int sum_of_even_digits = 0;
            while(n > 0){
                int digit = n % 10;
                if(digit % 2 == 0)
                    sum_of_even_digits += digit;
                else
                    sum_of_odd_digits += digit;

                n = n/10;
            }
            if(sum_of_even_digits % 4 == 0 || sum_of_odd_digits % 3 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
