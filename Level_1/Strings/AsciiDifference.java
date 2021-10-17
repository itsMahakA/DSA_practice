/* you have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1

input - acbfd
   output - a2c-1b4f2d
*/
import java.util.*;
public class AsciiDifference {
    public static String solution(String str){
		// write your code here
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length() ; i++){
		    if(i < (str.length() - 1)){
    		    char ch1 = str.charAt(i);
    		    char ch2 = str.charAt(i+1);
    		    sb.append(ch1);
    		    sb.append(ch2 - ch1);
		    }else{
		        char ch1 = str.charAt(i);
		        sb.append(ch1);
		    }
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
        scn.close();
	}
}
