// 1. You are given a number n.
// 2. You are given a base b. n is a number on base b.
// 3. You are required to convert the number n into its corresponding value in decimal number system.

import java.util.*;
  
  public class AnyBaseToDecimal{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int result = 0;
      int mul = 1;
      while(n>0){
        int quo = n/10;
        int rem = n%10;
        
        result+=(rem*mul);
        mul = mul * b;
        n = quo;
      }
      return result;
   }
}