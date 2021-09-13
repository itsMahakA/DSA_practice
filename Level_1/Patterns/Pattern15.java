//      1
//  2   3   2
//3 4   5   4   3
//  2   3   2
//      1

import java.util.*;

public class Pattern15{

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int nsp = n / 2;
    int nst = 1;
    int val = 1;

    for (int i = 1; i <= n; i++) {
      //loop for spaces
      for (int j = 1; j <= nsp; j++) {
        System.out.print("\t");
      }
      //loop for digits
      int ival = val;
      for (int j = 1; j <= nst; j++) {
        System.out.print(ival + "\t");

        if (j <= nst / 2) {
          ival++;
        } else {
          ival--;
        }
      }

      if (i <= n / 2) {
        val++;
        nsp--;
        nst = nst + 2;
      } else {
        val--;
        nsp++;
        nst = nst - 2;
      }

      System.out.println();
    }

  }
}