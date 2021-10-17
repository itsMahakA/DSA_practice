/* input - COMPuteR
    output - compUTEr
 */

import java.io.*;
import java.util.*;

public class ToggleCase {

	public static String toggleCase(String str){
		//write your code here
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < sb.length(); i++){
		    char ch = sb.charAt(i);
		    if(ch >= 'A' && ch<='Z'){
		        ch = Character.toLowerCase(ch);
		    }else{
		        ch = Character.toUpperCase(ch);
		    }
		    sb.setCharAt(i,ch);
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}