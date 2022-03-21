// https://nados.io/question/highest-frequency-character
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<Character,Integer> fmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!fmap.containsKey(ch)){
                fmap.put(ch , 1);
            }else{
                Integer oldf = fmap.get(ch);
                fmap.put(ch,oldf + 1);
            }
        }
        //getting char with max frequency
        char max = s.charAt(0);
        Set<Character> uniqueChar = fmap.keySet(); //give unique key , make set of hashmap
        for(char ch : uniqueChar){
            if(fmap.get(ch)  > fmap.get(max)){
                max = ch;
            }
        }
        System.out.println(max);
    }

}
