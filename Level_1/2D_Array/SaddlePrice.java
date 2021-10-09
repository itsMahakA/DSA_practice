/*
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
2. You are required to find the saddle price of the given matrix and print the saddle price. 
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
*/

import java.util.*;
public class SaddlePrice {
    
    public static void main(String[] args) throws Exception {
        // write your code here
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();

       int[][] arr = new int[n][n];
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[0].length; j++){
               arr[i][j] = scn.nextInt();
           }
       }

       for(int i = 0; i < arr.length; i++){
            int min = arr[i][0];
            int psj = 0;
            for(int j = 1; j < arr[0].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                    psj = j;
                }
            }

            boolean isSaddle = true;
            for(int ii = 0; ii < arr.length; ii++){
                if(arr[ii][psj] > min){
                    isSaddle = false;
                    break;
                }
            }

            if(isSaddle == true){
                System.out.println(min);
                return;
            }
       }

       System.out.println("Invalid input");
    }
    
}
