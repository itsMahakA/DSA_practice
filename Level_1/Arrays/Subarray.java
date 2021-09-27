// 1. You are given an array of size 'n' and n elements of the same array.
// 2. You are required to find and print all the subarrays of the given array. 
// 3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.

import java.io.*;
import java.util.*;

public class Subarray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    for(int i =0;i<n;i++){
        
        for(int j = i;j<n;j++){
            for(int x =i;x<=j;x++){
                System.out.print(arr[x]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
 }

}