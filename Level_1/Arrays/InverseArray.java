
import java.util.*;

public class InverseArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
    int[] inv = new int[a.length];
    for(int i =0 ;i<a.length;i++ ){
        int v = a[i];
        inv[v] = i;
    }
    return inv;
  }

public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] a = new int[n];
  for(int i = 0; i < n; i++){
    a[i] = sc.nextInt();
  }

  int[] inv = inverse(a);
  display(inv);
 }

}