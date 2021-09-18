// You are given two numbers n1 and n2 of base b.
// You are required to subtract n1 from n2 and print the value.
//constraints :
// 2 <= b <= 10
// 0 <= n1 <= 256
// n1 <= n2 <= 256

import java.util.*;
  
  public class SubtractionAnyBase {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int mul = 1;
       int result =0;
       int c = 0;
       while(n2>0){
        int d1 = n1%10;
        int d2 = n2%10;
 
        n1 = n1/10;
        n2 = n2/10;
 
        int dig = d2 - d1 -c;
        if(dig<0){
            c = 1;
            dig = dig + b;
        }
        else{
            c=0;
        }
 
        result = result + dig*mul;
        mul = mul*10;
    }

       return result;
   }
}