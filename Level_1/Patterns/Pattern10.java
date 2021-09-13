//       *	
//    *		*	
// *		    *	
//    *		*	
//       *	

import java.util.*;

public class Pattern10 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    int out_sp = n / 2;
    int in_sp = -1;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= out_sp; j++) {
        System.out.print("\t");
      }

      System.out.print("*\t");

      for (int j = 1; j <= in_sp; j++) {
        System.out.print("\t");
      }

      if (i != 1 && i != n) {
        System.out.print("*\t");
      }

      if (i <= n / 2) {
        out_sp--;
        in_sp += 2;
      }
      else {
        out_sp++;
        in_sp -= 2;
      }

      System.out.println();
    }


  }
}