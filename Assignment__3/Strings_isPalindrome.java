package Assignment_3;

/*
Take as input S, a string. Write a function that returns true if the string is a palindrome and false otherwise.
Print the value returned.

Input Format
String

Constraints
String length between 1 and 1000 characters

Output Format
Boolean

Sample Input
abba
Sample Output
true
Explanation
A string is said to be palindrome if reverse of the string is same as string.
For example, “abba” is palindrome as it's reverse is "abba", but “abbc” is not palindrome as it's reverse is "cbba".
*/

import java.util.Scanner;

public class Strings_isPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(isPalin(st));
    }
    static boolean isPalin(String st){
        int i = 0;
        int j = st.length() - 1;
        while(i < j){
            if(st.charAt(i++) != st.charAt(j--))
            {
                return false;
            }
        }
        return true;
    }
}
