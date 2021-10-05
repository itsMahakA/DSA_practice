// Take input for two arrays, a and b
// If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, 
// display the contents of prd array (row-wise)
// If the two arrays can't be multiplied, print "Invalid input".

import java.util.*;
public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1 details");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int [][]a = new int [n1][m1];
        for(int i = 0; i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter array 2 details");
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int [][] b = new int [n2][m2];
        for(int i = 0; i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();

        //product
        if(m1!=n2){
            System.out.println("Invalid input");
        }else{
            int [] [] prd = new int[n1][m2];
            for(int i=0; i<prd.length; i++){
                for(int j=0; j<prd[0].length ; j++){
                    int val=0;
                    for(int k=0; k<m1 ; k++){
                        val = val + (a[i][k] * b[k][j]);
                    }
                    prd[i][j] = val;
                }
            }

            //display output
            for(int i = 0; i<prd.length;i++){
                for(int j=0;j<prd[0].length;j++){
                   System.out.print(prd[i][j] + " ");
                }
                System.out.println();
            }

        }
        
    }
}
