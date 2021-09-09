// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.

import java.util.*;

public class Fibonacci {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    for (int i = 0; i < n; i++) {

      int c = a + b;
      System.out.println(a);
      a = b;
      b = c;
    }
  }
}
