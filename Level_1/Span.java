// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

import java.io.*;
import java.util.*;

public class Span{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i =0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }
    int result = getSpan(arr);
    System.out.println(result);
} 

    public static int getSpan(int arr[])
    {
    int max = arr[0];
    int min = arr[0];
    for(int i =1 ; i<arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
    }
    // System.out.println("max " + max);
    // System.out.println("min " + min);
    return max-min;
 }

}