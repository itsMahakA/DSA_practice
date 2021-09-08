// Input Format
// A number n

// Output:
//                  *
//              *   *
//          *   *   *
//      *   *   *   *
// *    *   *   *   *
import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n-1; //no. of spaces
        int nst = 1; //no. of stars
        
        for(int i =1;i<=n;i++){
            for(int j =1;j<=nsp;j++){
                System.out.print("\t");
                
            }
            for(int j =1;j<=nst;j++){
                System.out.print("*\t");
            }
            nst++;
            nsp--;
            System.out.println();
        }

    }
}


