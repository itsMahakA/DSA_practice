// to find maximum 3 digit num fom given 4 digit number
import java.util.*;

public class Max3Digit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int result = maximum(num);
        System.out.println(result);
    }
    
    public static int maximum(int num){
        int max =0;
        for(int i =4;i>=1;i--){
            int result = (num/(int)(Math.pow(10,i))) * (int)(Math.pow(10,i-1));
            result = result +( num%(int)(Math.pow(10,i-1)));
            
            if(result>max){
                max = result;
            }
        }
        return max;
    }
}
