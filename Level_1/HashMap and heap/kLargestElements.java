// https://nados.io/question/k-largest-elements
import java.util.*;
 import java.lang.*;
 import java.io.*;
 class Main
  {
 	 public static void main (String[] args) throws IOException
 	  {
 	 	 Scanner scn= new Scanner(System.in);
 	    	 int n = scn.nextInt();
 	 	 int[] num = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 num[i] = scn.nextInt();
 	 	 	 }
 	 	 int k = scn.nextInt();
 	 	 solve(n,num,k);
 	  }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array,n length of array and k.
 	 // It should print required output.
 	  public static void solve(int n,int[] arr,int k){
 	     //Write your code here
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		//insert only k elements
		for(int i = 0; i < k ;i++){
			pq.add(arr[i]);
		}

		//now traverse through rest of array and compare with pq
		for(int i = k; i < n; i++){
			int val = pq.peek();
			if(val < arr[i]){
				pq.remove();
				pq.add(arr[i]);
			}
		}

		//loop to print values
		int [] ans = new int[k];
		int i = 0;
		while(pq.size() > 0){
			ans [k - 1 - i]= pq.peek();
			i++;
			pq.remove();
		}
		for(int val : ans){
			System.out.print(val+ " ");
		}
     }
 }
