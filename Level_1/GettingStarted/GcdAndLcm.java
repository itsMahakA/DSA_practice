// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
// 3. Take input "num1" and "num2" as the two numbers.
// 4. Print their GCD and LCM.

import java.util.*;
    
    public class GcdAndLcm{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      
      int tn1 = n1;
      int tn2 = n2;
      while(n1%n2!=0){
          int rem = n1%n2;
          n1 = n2;
          n2 = rem;
      }
      int gcd = n2;
      int lcm = (tn1 * tn2)/gcd;
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }