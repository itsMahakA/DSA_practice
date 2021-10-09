 /*You are given a n*m matrix where n are the number of rows and m are the number of columns. 
 You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. 
 You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
 You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
input
11 12 13 14 15 16 17
21 22 23 24 25 26 27
31 32 33 34 35 36 37
41 42 43 44 45 46 47
51 52 53 54 55 56 57

shell/ring =2, r=3

o/p
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57


*/

import java.io.*;
import java.util.*;

import javax.sound.sampled.ReverbType;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] twod = new int [n][m];
        for(int i = 0; i < twod.length; i++){
            for(int j = 0; j < twod[0].length; j++){
            twod[i][j] = sc.nextInt();
            }
        }
        int s = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        int [] oned = getOnedFromTwod(twod,s);
        rotate(oned,r);
        fillTwod(twod,oned,s);
        display(twod);
    }

    public static int [] getOnedFromTwod(int [][] twod,int s){
        int total_row = twod.length;
        int total_col = twod[0].length;

        int minr = s - 1;
        int maxr = total_row - s;
        int minc = s - 1;
        int maxc = total_col - s;
        int hwall = 0;
        int vwall = 0;
        int size = 0;

        if(minr == maxr){
            hwall = maxc - minc + 1;
            size = hwall; 
        }

        else{
            hwall = maxc - minc + 1;
            vwall = maxr - minr + 1;
            size = 2*hwall + 2*vwall - 4;
        }
        
        int [] oned = new int[size];
        int idx = 0;
        if(minr == maxr){
            for(int i = minr,j = minc;j <= maxc; j++){
                oned[idx] = twod[i][j];
                idx++;
            }
        }else{
            //left wall-row = minr->maxr,col = minc
            for(int i =minr,j = minc;i<=maxr;i++){
                oned[idx] = twod[i][j];
                idx++;
            }
            minc ++;

            //botoom wall- row = maxr,col =minc->maxc
            for(int i =maxr,j = minc;j<=maxc;j++){
                oned[idx] = twod[i][j];
                idx++;
            }
            maxr--;

            //right wall row = maxr->minr ,col =maxc
            for(int i =maxr,j = maxc;i>=minr;i--){
                oned[idx] = twod[i][j];
                idx++;
            }
            maxc--;
            // top wall - row =minr, col = macx->minc 
            for(int i =minr,j = maxc;j>=minc;j--){
                oned[idx] = twod[i][j];
                idx++;
            }
            minr++;
        }
        
        return oned;
    }

    public static void rotate(int [] oned,int r){
        r = r % oned.length;
        if(r<0){
            r = r + oned.length;
        }

        reverse(oned, 0, oned.length-r-1);
        reverse(oned, oned.length-r, oned.length-1);
        reverse(oned, 0, oned.length-1);
    }
    
    public static void reverse(int [] arr,int left,int right){
        while(left<=right){
            int temp = arr[right];
            arr[right] =arr[left];
            arr[left] = temp;
            left++;
            right--;
        }

    }
    
    public static void fillTwod(int [][] twod, int[] oned,int s){
        int total_row = twod.length;
        int total_col = twod[0].length;

        int minr = s - 1;
        int maxr = total_row - s;
        int minc = s - 1;
        int maxc = total_col - s;
        int idx = 0;
        if(minr == maxr){
            for(int i = minr,j = minc;j <= maxc; j++){
                twod[i][j] = oned[idx];
                idx++;
            }
        }else{
            //left wall-row = minr->maxr,col = minc
            for(int i =minr,j = minc;i<=maxr;i++){
                twod[i][j] = oned[idx];
                idx++;
            }
            minc ++;

            //botoom wall- row = maxr,col =minc->maxc
            for(int i =maxr,j = minc;j<=maxc;j++){
                twod[i][j] = oned[idx];
                idx++;
            }
            maxr--;

            //right wall row = maxr->minr ,col =maxc
            for(int i =maxr,j = maxc;i>=minr;i--){
                twod[i][j] = oned[idx];
                idx++;
            }
            maxc--;
            // top wall - row =minr, col = macx->minc 
            for(int i =minr,j = maxc;j>=minc;j--){
                twod[i][j] = oned[idx];
                idx++;
            }
            minr++;
        }
        

    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
 