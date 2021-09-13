// 1. You've to print all prime numbers between a range. 
// 2. Take as input "low", the lower limit of range.
// 3. Take as input "high", the higher limit of range.
// 4. For the range print all the primes numbers between low and high (both included).

import java.util.*;

public class AllPrime {
  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int low = sc.nextInt();
    int high = sc.nextInt();


    for (int i = low; i <= high; i++) {
      int div = 2;
      boolean prime = true; 
      if(i==1){
        prime = false;
      }
      while (div * div <= i) {
        
        int rem = i % div;
        if (rem == 0) {
          prime = false;
        }

        div++;

      }
      
      if (prime == true) {
        System.out.println(i);
      }

    }

  }
}
