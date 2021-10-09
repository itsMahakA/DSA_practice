// n*m matrix- you need to take extra matrix
// n*n - you dont require any extra space ,just swap numbers(only travere through lower/upper triangle)

import java.util.*;

public class Transpose{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int [n][m];
        int [][] t = new int[m][n];
        
        //input arr
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[0].length ;j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        //printing given array matrix
        System.out.println("Given Matrix : ");
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[0].length ;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //for n*m matrix
        // for(int i =0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length ;j++){
        //          t[j][i] = arr[i][j]; 
        //     }
        // }

        // System.out.println("Transpose is : ");   
        // for(int i =0; i<t.length; i++){
        //     for(int j=0; j<t[0].length ;j++){
        //         System.out.print(t[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        //n*n matrix -traversing upper triangle
        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose Matrix : ");
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[0].length ;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

