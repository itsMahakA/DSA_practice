// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

import java.util.*;

public class PrintDigits {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tn = n; //makig temp variable

    //   counting no. of digits
    int digits = 0;
    while (tn != 0) {
      int quo = tn / 10;
      digits++;
      tn = quo;

    }
    // making divisor 
    int div = 1;
    
    //note no of iteration<digits because digits(div) = digits(n)
    // n=3 div=100,i.e no of zeros = digits-1
    
    for(int i=1;i<digits;i++){ 
        div=div*10;
    }
    
    // finally printing the digits
    for(int i =1;i<=digits;i++){
        int quo = n/div;
        int rem = n%div;
        
        System.out.println(quo);
        n = rem;
        div = div/10;
    }
    

  }
}