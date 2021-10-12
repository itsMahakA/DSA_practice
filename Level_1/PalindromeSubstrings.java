/*
1. You are given a string. 
2. You have to print all palindromic substrings of the given string.
*/
import java.util.*;
public class PalindromeSubstrings {
  public static boolean isPalindrome(String sub) {
    int l = 0;
    int r = sub.length() - 1;
    while (l <= r) {
      if (sub.charAt(l) == sub.charAt(r)) {
        l++;
        r--;
      } else {
        return false;
      }
    }
    return true;
  }
  public static void solution(String str) {
    //creating substring
    for (int i = 0; i < str.length() ; i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        String sub = str.substring(i, j);

        boolean palindrome = isPalindrome(sub);
        if (palindrome) {
          System.out.println(sub);
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    scn.close();
    solution(str);
  }
}

