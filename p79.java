

//Ques: Find the total number of pairs inthe Array whose sum is equals to the given value x.

import java.util.*;
public class p79 {
    static int PairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter "+n+" Elements");
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter Targeted Sum:- ");
            int target = sc.nextInt();
            System.out.println(PairSum(arr, target));
    }
}
