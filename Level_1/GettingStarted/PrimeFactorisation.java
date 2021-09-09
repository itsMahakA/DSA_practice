// 1. You are required to display the prime factorization of a number.
// 2. Take as input a number n.
// 3. Print all its prime factors from smallest to largest.

import java.util.*;

public class PrimeFactorisation{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
//   int tn = n; //temporary n
  for(int f =2;f*f<=n;f++){
      while(n%f==0){
          System.out.print(f+" ");
          n = n/f;
      }
      
  }
  if(n>1){
      System.out.print(n);
  }
  
  
 }
}
                               