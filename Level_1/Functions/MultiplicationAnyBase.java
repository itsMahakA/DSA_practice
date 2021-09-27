import java.util.*;

public class MultiplicationAnyBase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int c =0;
        int result =0;
        int count = 0;
        while(n2>0){
            int d2 = n2%10;
            n2 = n2/10;
            int tn1 = n1; //temporary n2
            int mul = (int)(Math.pow(10,count));
            while(tn1>0 ||c>0){
                int d1 = tn1%10;
                tn1 = tn1/10;
                int d = (d1*d2) + c;
                c = d/b;
                d = d%b;
                result = result + (d*mul);
                mul = mul*10;
            }
            
            count++;
        }
        
        System.out.println(result);

    }
}