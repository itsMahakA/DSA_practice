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
        int result =0;
        int mul =1;
        while(n>0){
            int quo = n/b2;
            int rem = n%b2;

            result+=(rem*mul);
            mul = mul*b1;
            n = quo;
        }
        return result;
    }
}

