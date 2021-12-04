
import java.io.*;
import java.util.*;

public class PrintMazePath {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int row = scn.nextInt();
    int col = scn.nextInt();
    printMazePath(0,0,row-1,col-1,"");
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  public static void printMazePath(int sr, int sc, int dr, int dc, String psf) {
    if(sc > dc || sr > dr){
        return;
    }else if(sc==dc && sr==dr){
        System.out.println(psf);
    }
    
    printMazePath(sr, sc+1,dr,dc,psf+"h");
    printMazePath(sr+1, sc, dr,dc,psf + "v");
  }

}