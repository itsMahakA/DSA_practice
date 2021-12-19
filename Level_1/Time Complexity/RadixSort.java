import java.io.*;
import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    // write code here    
    int max = arr[0];
    for(int i = 1; i < arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    int div = 1;
    while(max/div > 0){
        countSort(arr,div);
        div = div*10;
    }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    int [] farr = new int[10]; //range of diguts= 0-9 , range =10
    int [] ans = new int[arr.length];
    
    //fill farr
    for(int i = 0; i < arr.length ; i++){
        int val = arr[i] / exp % 10;
        farr[val]++;
    }
    
    //psarr
    for(int i = 1; i <farr.length ; i++){
        farr[i] +=farr[i-1];
    }
    //ans arr
    for(int i = arr.length-1 ; i>=0 ;i--){
        int val = arr[i] / exp % 10;
        int pos = farr[val];
        ans[pos - 1] = arr[i];
        farr[val]--;
    }
    //arr
    for(int i = 0 ; i<arr.length ; i++){
        arr[i] = ans[i];
    }
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}