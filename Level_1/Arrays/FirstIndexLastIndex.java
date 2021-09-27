/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3.A number whose first and last index you have to find.

Asssumption - Array is sorted. Array may have duplicate values.
*/

import java.util.*;

public class FirstIndexLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int last = -1;
        int first = -1;
        int low = 0;
        int high = n-1;
        //loop for first index
        while(low<=high){
            int mid = (low + high) /2;
            if(num>arr[mid]){
                low = mid+1;
            }
            else if(num< arr[mid]){
                high = mid-1;
            }
            else{
                first = mid;
                high = mid-1;
            }
        }
        //loop for last index
        low = 0;
        high = n-1;
        while(low<=high){
            int mid = (low + high) /2;
            if(num>arr[mid]){
                low = mid+1;
            }
            else if(num< arr[mid]){
                high = mid-1;
            }
            else{
                last = mid;
                low = mid+1;
            }
        }
        System.out.println("first = " + first);
        System.out.println("last = " + last);
    }
}
