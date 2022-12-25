package Assignment_2;

/*

Given an array Arr[], Treat each element of the array as the digit and whole array as the number.
Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.

If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.

Note: The replacement must be in-place, do not allocate extra memory.

Input Format
The First Line contains the Number of test cases T.
Next Line contains an Integer N, number of digits of the number.
Next Line contains N-space separated integers which are elements of the array 'Arr'.

Constraints
1 <= T <= 100
1 <= N <= 1000
0 <= Ai <= 9

Output Format
Print the Next Permutation for each number separated by a new Line.

Sample Input
2
3
1 2 3
3
3 2 1

Sample Output
1 3 2
1 2 3

Explanation
Possible permutations for {1,2,3} are {1,2,3} , {1,3,2} , {2,1,3} , {2,3,1}, {3,1,2} and {3,2,1}. {1,3,2} is
the immediate next permutation after {1,2,3}.
For the second testcase , {3,2,1} is the last configuration so we print the first permutation as its next permutation.

*/

import java.util.Scanner;

public class Next_Permutation {
    public static void Reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void Permutation(int arr[])
    {
        int p=0;

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }

        int q=0;
        for(int i=arr.length-1;i>p;i--)
        {
            if(arr[i]>arr[p])
            {
                q=i;
                break;
            }
        }

        if(p==0 && q==0)
        {
            Reverse(arr,0,arr.length-1);
            return;
        }

        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        Reverse(arr,p+1,arr.length-1);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-- > 0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            Permutation(arr);
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }


    }
}
