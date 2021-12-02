/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the maximum of input. */

import java.util.*;

public class MaxInArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = maxOfArray(arr, 0); 
        System.out.println(result);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        int max = maxOfArray(arr, idx+1);
        if(arr[idx] > max){
            return arr[idx];
        }else{
            return max;
        }
    }

}
