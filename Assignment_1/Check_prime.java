package Assignment_1;

import java.util.Scanner;

/*
Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

Input Format
Constraints
2 < N <= 1000000000

Output Format
Sample Input
3
Sample Output
Prime
Explanation
The output is case specific
*/
public class Check_prime {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        if(solution(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
    static boolean solution(int n){
        if(n <= 3)
        {
            return true;
        }

        for(int i = 2 ; i <= n/2 ; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
