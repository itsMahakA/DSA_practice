/* n =6 
1 2 3 4 5 6 
13 14 15 16 17 18 
25 26 27 28 29 30 
31 32 33 34 35 36 
19 20 21 22 23 24 
7 8 9 10 11 12 

n = 5
1 2 3 4 5 
11 12 13 14 15 
21 22 23 24 25 
16 17 18 19 20 
6 7 8 9 10 
*/
import java.util.*;
public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        for(int count = 0; count < n; count++){
            int val = (n*i) - (n-1);
            for(int j = 0; j < n; j++){
                System.out.print(val + " ");
                val++;
            }
            if(n%2 !=0){
                if(count < n/2){
                    i = i + 2;
                }
                else if(count == n/2){
                    i= i - 1;
                }else{
                    i = i-2;
                }
            }else{
                if(count < (n/2 - 1)){
                    i = i + 2;
                }
                else if(count == (n/2 - 1)){
                    i= i + 1;
                }else{
                    i = i-2;
                }
            }
            System.out.println();
        }
    }
}
