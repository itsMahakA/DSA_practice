// *				*	
// *				*	
// *		*		*	
// *	*		*	*	
// *				*	

import java.util.*;

public class Pattern20 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for (int i = 1; i <= n; i++) {
      //for 1st half
      if (i <= n / 2) {
        for (int j = 1; j <= n; j++) {
          if (j == 1 || j == n) {
            System.out.print("*\t");
          }
          else {
            System.out.print("\t");
          }

        }
      }
        
        else{
            for(int j = 1;j<=n;j++){
                if(j==1||j==n||(i==j)||(i+j==n+1)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
        }
        
        //next line
        System.out.println();
      

    }


  }
}
