// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the
// arrays.

import java.util.*;

public class SumOfArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] a1 = new int[n1];
        for(int i =0;i<n1;i++){
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for(int i = 0;i<n2;i++){
            a2[i] = sc.nextInt();
        }
        
        int [] sum = new int[n1>n2 ? n1 :n2];
        int c= 0;
        int k = sum.length-1;
        int i = a1.length-1;
        int j = a2.length-1;

        while(k>=0){
            int d = c;
            if(i>=0){
                d+=a1[i];
            }
            if(j>=0){
                d+=a2[j];
            }

            c = d/10;
            d =d%10;
            sum[k] = d;
            k--;
            j--;
            i--;
        }
        if(c>0){
            System.out.println(c);
        }

        for(int item : sum){
            System.out.println+(item);
        }
    }
}