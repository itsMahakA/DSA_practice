import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class DiagonalWaveTraversal {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        
        for(int d = 0; d <= (2*n-1) ;d++){
            int i ;
            int j;
            if(d < n - 1){
                if(d % 2 == 0){
                    i = n - 1 - d;
                    j = 0;
                }else{
                    i = n - 1;
                    j = d;
                }
            }else if(d > n-1){
                if(d % 2==0){
                    i = 0;
                    j = d - (n-1);
                }else{
                    i = 2*n - 2 - d;
                    j = n-1;
                }
            }else{
                if(d % 2==0){
                    i = 0;
                    j = 0;
                }else{
                    i = n-1;
                    j = n-1;
                }
            }
            
            if(d % 2==0){
                while(i < n && j<n){
                    System.out.println(arr[i][j]);
                    i++;
                    j++;
                }
            }else{
                while(i>=0 && j>=0){
                    System.out.println(arr[i][j]);
                    i--;
                    j--;
                }
            }
        }
    }
}
