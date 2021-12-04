/* 1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - 
to get the list of all paths that can be used to move from top-left to bottom-right.
*/

import java.io.*;
import java.util.*;

public class GetMazePath {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        ArrayList<String> paths = getMazePaths(1,1,row,column);
        System.out.println(paths);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<String> ();
            bres.add("");
            return bres;
        }else if(sr > dr || sc > dc){
            ArrayList<String> bres = new ArrayList<String> ();
            return bres;
        }
        
        ArrayList<String> hpaths = getMazePaths(sr,sc + 1, dr,dc);
        ArrayList<String> vpaths = getMazePaths(sr+1, sc, dr, dc);
        ArrayList<String> paths = new ArrayList<String>();
        
        for(String hpath : hpaths){
            paths.add("h" + hpath);
        }
        for(String vpath: vpaths){
            paths.add("v" + vpath);
        }
        
        return paths;
    }

}