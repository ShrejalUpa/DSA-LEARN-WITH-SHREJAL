//check if we can partition the array into two sub arrays with equal sum more formally,check that the prefix sum of a part of the array is equal to the suffix sum of the rest array.

import java.util.*;
public class p98{
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i = 0; i< arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for(int i =0; i<arr.length; i++){
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter"+n+"elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal Partition possiblez: "+equalSumPartition(arr));
    }
}