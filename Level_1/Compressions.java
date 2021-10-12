/* You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
*/

import java.io.*;
import java.util.*;

public class Compressions {

  public static String compression1(String str) {
    // write your code here
    String s = "";
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) != str.charAt(i + 1)) {
        s = s + str.charAt(i);
      }
    }
    s = s + str.charAt(str.length() - 1);
    return s;
  }

  public static String compression2(String str) {
    // write your code here
    String s = "";
    int count = 1;
    for (int i = 0; i < str.length() - 1; i++) {
        
        if(str.charAt(i) == str.charAt(i+1)){
            count++;
        }
        else{
            s = s + str.charAt(i) ;
            if(count>1){
                s = s + count;
                count = 1;
            }
        }
    }
    s = s + str.charAt(str.length() - 1);
    if(count > 1){
        s = s + count;
    }

    return s;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }
}