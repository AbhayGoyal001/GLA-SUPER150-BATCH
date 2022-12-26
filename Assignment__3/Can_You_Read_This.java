package Assignment_3;

/*

One of the important aspect of object-oriented programming is readability of the code. To enhance the readability of code,
developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case.
FindAllTheWordsContainedInIt.

Input Format
A single line contains the string.

Constraints
|S|<=1000

Output Format
Print words present in the string, in the order in which it appears in the string.

Sample Input
IAmACompetitiveProgrammer
Sample Output
I
Am
A
Competitive
Programmer
Explanation
There are 5 words in the string.

*/

import java.util.Scanner;

public class Can_You_Read_This {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        printWords(st);
    }

    static void printWords(String st){
        int p = 0;
        for(int i = 1 ; i < st.length() ; i++){
            char ch = st.charAt(i);
            if(ch >= 65 && ch <= 90){
                System.out.println(st.substring(p , i));
                p = i;
            }
        }

        System.out.println(st.substring(p));
    }
}
