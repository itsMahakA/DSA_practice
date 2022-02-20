// https://nados.io/question/longest-consecutive-sequence-of-elements

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    //fill hashmap with all true
    HashMap<Integer, Boolean> map = new HashMap<>();
    for(int val : arr) map.put(val,true);

    //update to false- which are not start of sequence
    //i.e unse ek chota element present h
    for(int val : arr){
        if(map.containsKey(val-1) == true){
            map.put(val,false);
        }
    }

    //Now only work on val which are true ie start of sequence
    int maxlength = 0;
    int maxSOS = 0; //start of sequence
    for(int val : arr){
       
        if(map.get(val) == true){
            int tempLength = 1;
            int tempSOS = val;
            while(map.containsKey(tempSOS + tempLength) == true){
                tempLength++;
            }

            if(tempLength > maxlength){
                maxlength = tempLength;
                maxSOS = tempSOS;
            }
        }

    }

    //just print val from SOS till maxLength
   for(int i = 0; i < maxlength; i++){
       System.out.println(maxSOS + i);
   }

 }

}
