// 1. You are given a number n, representing the count of elements.
//  2. You are given n numbers. 
//  3. You are required to print all subsets of arr.
//  Each subset should be on separate line. 

import java.io.*;
import java.util.*;

public class Subset{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    int limit = (int)Math.pow(2,arr.length);
    for(int i =0;i<limit;i++){
        String ans = "";
        int temp =i;
        for(int j =n-1;j>=0;j--){
            int rem = temp%2;
            temp = temp/2;

            if(rem==0){
                ans = "_" + ans;
            }
            else{
                ans = arr[j] + ans;
            }
        }
        System.out.println(ans);
    }
 }

}