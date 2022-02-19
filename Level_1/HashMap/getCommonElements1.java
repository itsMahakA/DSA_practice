//https://nados.io/question/get-common-elements-1?zen=true
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int [] arr1 = new int[n1];
    for(int i = 0; i < n1; i++){
        arr1[i] = sc.nextInt();
    }
    int n2 = sc.nextInt();
    int [] arr2 = new int[n2];
    for(int i = 0; i < n2 ; i++){
        arr2[i] = sc.nextInt();
    }

    //traverse through arr1 and fill hashmap
    HashMap <Integer,Integer> fmap = new HashMap<>();
    for(int val : arr1){
        if(fmap.containsKey(val) == false){
            fmap.put(val,1);
        }else{
            Integer old = fmap.get(val);
            fmap.put(val,old + 1);
        }

    }

    //now traverse through arr2 check if it is present in arr1
    // if present -> print it-> remove from arr1
    for(int val : arr2){
        if(fmap.containsKey(val)){
            System.out.println(val);
            fmap.remove(val);
        }
    }
    
 }


}
