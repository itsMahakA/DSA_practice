// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.

import java.util.*;
  
  public class CountDigits{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int digits = 0;
    
    while(n!=0){
        int quo = n/10;
        digits++;
        n = quo;
    }
    
    System.out.println(digits);
    
   }
  }