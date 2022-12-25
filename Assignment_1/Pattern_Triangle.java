package Assignment_1;

import java.util.Scanner;
/*
Take N (number of rows), print the following pattern (for N = 4).

                       1
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
Input Format
Constraints
0 < N < 10

Output Format
Sample Input
4
Sample Output
            1
		2	3	2
	3	4	5	4	3
4	5	6	7	6	5	4
Explanation
Each number is separated from other by a tab.


*/
public class Pattern_Triangle {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sol_2(n);
        sc.close();
    }

    public static void sol_2(int n){
        int space = n-1, star = 1, val = 1;
        int row = 1;

        while(row <= n){
            int col = 1;
            while(col <= space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            while(col <= star){
                System.out.print(val + " ");
                col++;
                if(col <= (star/2)+1){
                    val++;
                }
                else{
                    val--;
                }
            }
            System.out.println();
            star+=2;
            space--;
            row++;
            val=row;
        }
    }
}
