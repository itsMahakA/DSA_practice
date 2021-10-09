// Given a sorted array A[] of N positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. 
// Find the number occurring only once.

// Example 1:

// Input:
// N = 5
// A = {1, 1, 2, 5, 5}
// Output: 2

import java.util.*;
public class AppearOnce{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int result = solution(arr,n);
        System.out.println(result);

    }

    public static int solution(int arr[],int n){
        //method 1 XOR
        // int result =0 ;
        // for(int i =0 ;i<n ;i++){
        //     result = result^a[i];
        // }
        // return result;

        // Binary Search
        int high=n-1;
        int low =0;

        //boundary check
        if(high==0)
            return arr[high];
        else if(arr[0]!=arr[1])
            return arr[0];
        else if(arr[high]!=arr[high-1])
            return arr[high];
        
        //binary search
        while(low<=high){
            int mid =(low + high)/2;

            //unique element condition
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
                return arr[mid];
            
            else if(((mid%2)==0 && arr[mid]==arr[mid+1]) || ((mid%2)==1 && arr[mid]==arr[mid-1])){
                low = mid+1;
            }
            else 
                high = mid-1;
        }

        return -1;
    }
}