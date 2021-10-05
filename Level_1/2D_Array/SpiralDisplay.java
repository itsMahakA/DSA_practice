// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.

import java.util.*;
public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] [] arr = new int[n][m];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;
        int count = 0;
        int total = n*m;

        while(count<total){
            //left wall
            for(int i =minr ,j=minc;i<=maxr ; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            //bottom wall
            for(int i = maxr, j = minc ;j<=maxc && count<total ;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            //right wall
            for(int i = maxr , j = maxc; i>=minr && count<total ; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            //top wall
            for(int i =minr , j =maxc ; j>=minc && count<total; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
}
