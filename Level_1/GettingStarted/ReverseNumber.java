// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

import java.util.*;

public class ReverseNumber {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    //  instead counting no. of digits do directly 
    // because everytime div =10 
    // n digits were mainly used to make div
    int digits = 0;
    while (n != 0) {
      int quo = n / 10;
      int rem = n % 10;
      System.out.println(rem);
      n = quo;

    }

  }
}