// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340

import java.util.*;

public class RotateNum {

  public static void main(String[] args) {
    // approach 1
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int tn = n;
    int dig = 0;
    while(tn!=0){
        int quo = tn/10;
        dig++;
        tn = quo;
    }
    // special case:k<0or k>dig
    k=k%dig;
    if(k<0){
        k = k+dig;
    }
    
    
    //make divisor
    int div = 1;
    int mul =1;
    for(int i=1;i<=dig;i++){
        if(i<=k){
            div=div*10;
        }
        else{
            mul=mul*10;
        }
        
    }

    int rem = n%div;
    int quo = n/div;
    int result = (rem*mul)+quo;
    System.out.println(result);
  }
}