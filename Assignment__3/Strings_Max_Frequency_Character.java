package Assignment_3;

import java.util.Scanner;

/*

Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000.

Output Format
Character

Sample Input
aaabacb
Sample Output
a
Explanation
For the given input string, a appear 4 times. Hence, it is the most frequent character.


*/
public class Strings_Max_Frequency_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        maxFrequencyChar(st);
    }

    static void maxFrequencyChar(String st){
        int[] arr = new int[26];
        for(int i = 0 ; i < st.length() ; i++){
            char ch = st.charAt(i);
            arr[ch - 97]++;
        }
        int max = arr[0];
        int p = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] > max){
                max = arr[i];
                p = i;
            }
        }
        System.out.println((char) (p + 97));
    }
}
