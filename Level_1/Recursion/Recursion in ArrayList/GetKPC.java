/* 
*/

import java.io.*;
import java.util.*;

public class GetKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> words= getKPC(str);
        System.out.println(words);

    }
    
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
            
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);
        ArrayList<String> rrem = getKPC(rem);
        ArrayList<String> myres = new ArrayList<String>();
        String code = codes[ch-48];
        
        for(int i = 0; i < code.length() ; i++){
            char chi = code.charAt(i);
            for(String rstr : rrem){
                myres.add(chi + rstr);
            }
        }
        return myres;
    }
    

}