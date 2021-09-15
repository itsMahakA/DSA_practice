// 1. You are given a number n.
// 2. You are given a digit d.
// 3. You are required to calculate the frequency of digit d in number n.
import java.util.*;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dig = scn.nextInt();
        int count = getDigitFrequency(n, dig);
        System.out.println(count);
    }

    public static int getDigitFrequency(int n, int dig) {
        // write code here
        int f = 0;  //frequency
        while(n>0){
            if(n%10 == dig){
                f++;
            }

            n = n/10;
        }
        return f;
    }
}
