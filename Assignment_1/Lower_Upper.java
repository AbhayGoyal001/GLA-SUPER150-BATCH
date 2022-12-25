package Assignment_1;
/*
Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" is character lies between 'A-Z' and
print "Invalid" for all other characters like $,.^# etc.

Input Format
Single Character .

Constraints
-

Output Format
lowercase UPPERCASE Invalid

Sample Input
$
Sample Output
Invalid
Explanation
-*/
import java.util.Scanner;
public class Lower_Upper {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>=65 && ch<=90)
            System.out.println("UPPERCASE");
        else if(ch>=97 && ch<=122)
            System.out.println("lowercase");
        else
            System.out.println("Invalid");
    }
}
