/* 1. You are given an ArrayList of positive integers.
2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

Note -> The order of elements should remain same.
*/

import java.util.*;

public class RemovePrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> list1 = new ArrayList<>();
        for(int i = 0; i < n ;i++){
            list1.add(sc.nextInt());
        }
        removePrime(list1);
        System.out.println(list1);
    }
    public static void removePrime(ArrayList <Integer> list1){
        for(int i = list1.size()-1 ; i>=0; i--){
            int num = list1.get(i);
            boolean isThisValPrime = isPrime(num);
            if(isThisValPrime){
                list1.remove(i);
            }
            
        }
    }
    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int div = 2; div * div <= num; div++){
            if(num % div == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
