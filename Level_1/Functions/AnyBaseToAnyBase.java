// 1. You are given a number n.
// 2. You are given a base b1. n is a number on base b1.
// 3. You are given another base b2.
// 4. You are required to convert the number n of base b1 to a number in base b2.

import java.util.*;

public class AnyBaseToAnyBase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int result = getResult(n,b1,b2);
        System.out.println(result);
    }

    public static int getResult(int n ,int b1,int b2){
        int part1 = b1ToDecimal(n,b1);
        int part2 = decimalTob2(part1 , b2);

        return part2;
    }

    public static int b1ToDecimal(int n ,int b1){
        int result = 0;
        int mul = 1;
        while(n>0){
            int quo = n/10;
            int rem = n%10;
        
            result+=(rem*mul);
            mul = mul * b1;
            n = quo;
      }
      return result;
    }

    public static int decimalTob2(int num , int b2){
        int mul = 1;
        int result =0 ;
     
        while(num>0){
         int quo = num/b2;
         int rem = num%b2;
         result+=(rem*mul);
         num = quo;
         mul = mul*10;
 
        }
        return result;
    }
}


