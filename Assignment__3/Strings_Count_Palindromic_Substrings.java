package Assignment_3;

/*

Take as input S, a string. Write a program that gives the count of substrings of this string which are palindromes and
Print the ans.

Input Format
Single line input containing a string

Constraints
Length of string is between 1 and 1000.

Output Format
Integer output showing the number of palindromic substrings.

Sample Input
abc
Sample Output
3
Explanation
For the given sample case , the palindromic substrings of the string abc are "a","b" and "c". So, the ans is 3.

*/

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int count = 0;
        for(int i = 0 ; i < st.length() ; i++){
            for(int j = i ; j < st.length() ; j++){
                if(isPalin(st.substring(i , j))){
                    System.out.println(st.substring(i , j));
                    count++;
                }
            }
        }
        count += st.length();
        System.out.println(count);
    }

    static boolean isPalin(String st){
        if(st.length() == 1 || st.isEmpty())
            return false;
        int s = 0;
        int e = st.length() - 1;
        while (s < e){
            char ch = st.charAt(s++);
            char hc = st.charAt(e--);
            if(ch != hc){
                return false;
            }
        }
        return true;
    }
}
