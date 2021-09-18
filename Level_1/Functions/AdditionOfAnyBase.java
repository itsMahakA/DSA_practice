// You are given two numbers n1 and n2 of base b.
// You are required to add the two numbes and print their value in base b.

import java.util.*;
  
  public class AdditionOfAnyBase {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int c = 0; //carry
       int mul = 1;
       int result = 0;
       while(n1>0 || n2>0 || c>0){
           int d1 = n1%10;
           int d2 = n2%10;

           n1 = n1/10;
           n2 = n2/10;

           int dig = d1 + d2 + c;
           c = dig/b;
           dig = dig%b;
           
           result=result + (dig*mul);
           mul = mul *10;
        //    System.out.println(c + " " + dig + " "+result+ " " +mul);
       }
       
       return result;
   }
}