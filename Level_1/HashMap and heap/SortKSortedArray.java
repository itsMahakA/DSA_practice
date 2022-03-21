import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here

      PriorityQueue <Integer> pq = new PriorityQueue<>();
      for(int i = 0; i<=k ;i++){
         pq.add(arr[i]);
      }

      //now start traversing remaining array and print,remove,add next
      for(int i = k+1; i < arr.length; i++){
         int val = pq.peek();
         System.out.println(val);
         pq.remove();
         pq.add(arr[i]);
      }

      //removing remaining elements from pq if any
      while(pq.size() > 0){
         int val = pq.peek();
         System.out.println(val);
         pq.remove();
      }



   }

}
