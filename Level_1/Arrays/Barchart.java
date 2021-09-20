// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print a bar chart representing value of arr a		*		

import java.io.*;
import java.util.*;

public class Barchart{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int [] a = new int[n];
    for(int i =0;i<n;i++){
        a[i] = sc.nextInt();
    }

    //find max
    int max =a[0];
    for(int i =1;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    //barchart
    int temp =max;
    for(int i =1;i<=max;i++){
        
        for(int j =0;j<n;j++){
            if(a[j]<temp){
                System.out.print("\t");
            }
            else{
                System.out.print("*\t");
            }
        }
        temp--;
        System.out.println();
    }

 }
}
