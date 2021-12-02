/* 1. You are given a positive number n. 
2. You are required to print the counting from n to 1 and back to n again.
*/

import java.util.*;
public class PrintDecreasingIncreasing {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0){
            return ;
        }
        
        pdi(n-1);
        System.out.println(n);
        System.out.println(n);
        pdi(n-1);
    }
}
