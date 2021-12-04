/* 1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
*/

import java.util.*;

public class GetSubsequence{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans =  getSS(str);
        System.out.println(ans);
    }

    public static ArrayList<String> getSS(String str) {
        //base case when str len ==0 , return ""
        if(str.length() == 0){
            ArrayList<String> baseSub = new ArrayList<>();
            String result = "";
            baseSub.add(result);
            return baseSub;
        }



        char ch = str.charAt(0);
        String rem_String = str.substring(1); //remaining string

        ArrayList<String> gss_rem = getSS(rem_String); //getting all subsequence all remaing string
        ArrayList<String> result = new ArrayList<>(); // creating  result string;

        for(String item : gss_rem){ //for each item in gss_rem adding "" at the starting of gss_rem and store in result
            // result.add("" + item);
            result.add(item);
        }

        for(String item : gss_rem){ //for each item in gss_rem adding ch(1st char ) at starting
            result.add(ch + item);
        }
        return result;
        
    }
}