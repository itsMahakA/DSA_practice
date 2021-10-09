//given matrix - n*n
// step1- transpose
// step -2 reverse

import java.util.*;

public class RotationBy90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[0].length ;j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        sc.close();

        //transpose
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse
        for(int i=0;i<arr.length;i++){
            int left = 0;
            int ri = arr[i].length-1;

            while(left<ri){
                int temp = arr[i][left];
                arr[i][left] = arr[i][ri];
                arr[i][ri]=temp;
                left++;
                ri--;
            }
            
        }

        //display
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[0].length ;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
