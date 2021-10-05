// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to display the contents of 2d array row-wise.

import java.util.*;

public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] [] arr = new int [n][m];
        for(int i=0 ; i<arr.length ;i++){
            for(int j =0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        //output 
        for(int i=0 ; i<arr.length ;i++){
            for(int j =0; j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
