// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

// Assumption - number represented by a2 is greater.

import java.util.*;

public class Difference{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
          a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
          a2[i] = sc.nextInt();
        }
    
        int [] diff = new int[n2]; //n2 is greater
        int c = 0;
        int k = diff.length - 1;
        int i = a1.length - 1;
        int j = a2.length - 1;
        while (k >= 0) {
          int d = a2[j] - c ;
          if (i >= 0) {
            d = d - a1[i];
          }
          
          if (d < 0) {
            c = 1;
            d = d + 10;
          }else{
              c=0;
          }
          
          diff[k] = d;
          k--;
          i--;
          j--;
    
        }

        //not to print starting zeroes
        int idx=0;
        while(idx < diff.length){
            if(diff[idx]!=0){
                break;
            }
            else{
                idx++;
            }
        }

        for(int x = idx;x<diff.length;x++){
            System.out.println(diff[x]);
        }
        
    }
}