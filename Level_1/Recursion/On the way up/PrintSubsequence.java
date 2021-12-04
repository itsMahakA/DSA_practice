/* 1. You are given a string str.
2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
*/

import java.util.*;

public class PrintSubsequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSS(str,"");
    }

    public static void printSS(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        str = str.substring(1);

        printSS(str , ans + ch);
        printSS(str, ans);
    }
}