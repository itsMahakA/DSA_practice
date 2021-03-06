import java.util.*;

public class FirstIndexWithRecursion {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        sc.close();
        int fi = firstIndex(arr,0,x);
        System.out.println(fi);
    }
    public static int firstIndex(int[] arr, int idx ,int x){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }else{
            int ans = firstIndex(arr, idx + 1; x);
            return ans;
        }
    }
}
