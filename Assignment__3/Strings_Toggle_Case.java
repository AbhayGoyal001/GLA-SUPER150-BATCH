package Assignment_3;

/*

Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abC
Sample Output
ABc
Explanation
Toggle Case means to change UpperCase character to LowerCase character and vice-versa.

*/

import java.util.Scanner;

public class Strings_Toggle_Case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        toggleString(st);
    }

    static void toggleString(String st){
        for(int i = 0 ; i < st.length() ; i++){
            char ch = st.charAt(i);

            if(ch >= 65 && ch <= 90){
                System.out.print(toLower(ch));
            }

            else{
                System.out.print(toUpper(ch));
            }
        }
    }

    static char toLower(char ch){

//    Method-1 --->  To convert UpperCase Letter to lower case letter we need set the 5th bit of the Character.
//            return (char)(ch | 1<<5);


//    Method-2 --->  ASCII VALUE of space(' ') is 32 and its binary is 100000 ,
//        so we can OR(bitwise) ' ' with the UpperCase character to convert it to lowerCase character.
        return (char)(ch | ' ');
    }



    static char toUpper(char ch){
//    Method-1 --->   To covert LowerCase Letter to upper case letter we need to un-set the 5th bit of the Character.
//            return (char)(ch & ~(1 << 5));

//    Method-2 ---> ASCII VALUE of underscore('_') is 95 and its binary iscdc 1011111 ,
//         so we can AND(bitwise) '_' with the LowerCase character to convert it to upperCase character.

        return (char) (ch & '_');
    }
}
