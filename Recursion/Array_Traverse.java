package Recursion;

import java.util.Scanner;

public class Array_Traverse {
    public static void main(String[] args) {
        int[] arr = {1,23,4,45,6,7};
        Traverse(arr,0);
    }

    private static void Traverse(int[] arr,int i) {
        if(i>arr.length-1)
            return;
        System.out.println(arr[i]);
        Traverse(arr,i+1);
    }
}
