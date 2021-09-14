// *       *       *       *       *       *       *
//         *                               *
//                 *               *
//                         *
//                 *       *       *
//         *       *       *       *       *
// *       *       *       *       *       *       *

import java.util.*;

public class Pattern18 {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int nsp =0;
     int nst = n;

     for(int i = 1;i<=n;i++){
         for(int j =1;j<=nsp;j++){
             System.out.print("\t");
         }

        if(i>1 && i<=n/2){
            for(int j =1;j<=nst;j++){
                if(j==1 || j==nst){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
        }

        else{
            for(int j =1;j<=nst;j++){
                System.out.print("*\t");
            }
        }
        System.out.println();

        if(i<=n/2){
            nsp++;
            nst-=2;
        }
        else{
            nsp--;
            nst+=2;
        }
     }

 }
}
