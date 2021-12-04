/* 1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - 
to get the list of all paths that can be used to climb the staircase up.
*/

import java.io.*;
import java.util.*;

public class GetStairPath {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
        
    }

    public static ArrayList<String> getStairPaths(int n) {
        //base case
        if(n == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }else if(n<0){  //when on 2nd step and you take 3 jump -> 2-3=-1 i.e less than 0 - no sense
            ArrayList<String> bres = new ArrayList<String>();
            return bres;
        }
        
        
        //3 steps are allowed - 1s,2s,3s

        ArrayList<String> pathnm1 = getStairPaths(n-1);
        ArrayList<String> pathnm2 = getStairPaths(n-2);
        ArrayList<String> pathnm3 = getStairPaths(n-3);
        
        ArrayList<String> result = new ArrayList<String>();
        
        for(String item : pathnm1){
            result.add("1" + item);
        }
        for(String item : pathnm2){
            result.add("2" + item);
        }
        for(String item : pathnm3){
            result.add("3" + item);
        }
        
        return result;
    }

}