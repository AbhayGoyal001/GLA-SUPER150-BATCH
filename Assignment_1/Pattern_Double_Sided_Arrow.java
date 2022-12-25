package Assignment_1;
/*
Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1
Input Format
Take N as input.

Constraints
N is odd number.

Output Format
Pattern should be printed with a space between every two values.

Sample Input
7
Sample Output
            1
        2 1   1 2
    3 2 1       1 2 3
4 3 2 1           1 2 3 4
    3 2 1       1 2 3
        2 1   1 2
            1
Explanation
Catch the pattern and print it accordingly.
*/
import java.util.Scanner;
public class Pattern_Double_Sided_Arrow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1, space1 = n-1,space2 = -1, row = 1, val = 1;

        while(row <= n){
            int col = 1;
            while(col <= space1){
                System.out.print("  ");
                col++;
            }
            col = 1;
            if(row <= n/2+1) {
                val = row;
            }
            else{
                val = n-row+1;
            }
            while(col <= star){
                System.out.print(val + " ");
                col++;
                val--;
            }
            col = 1;
            while(col <= space2){
                if(row!=1)
                    System.out.print("  ");
                col++;
            }
            col = 1;
            val = 1;
            while(col <= star){
                if(row != 1 && row != n)
                    System.out.print(val + "  ");
                col++;
                val++;
            }
            row++;
            System.out.println();
            if(row <= n/2+1){
                space1 -= 2;
                space2 += 2;
                star++;
            }
            else {
                space1 += 2;
                space2 -= 2;
                star--;
            }



        }

        sc.close();
    }
}
