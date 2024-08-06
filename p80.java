



//Ques: Count the number of triplets whose sum is equal to the given value x.

import java.util.*;

public class p80 {
    static int TripletSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " Elements.");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();  // Input for array elements
        }

        System.out.println("Enter target value: ");
        int target = sc.nextInt();

        int result = TripletSum(arr, target);
        System.out.println("Number of triplets with sum equal to " + target + " is: " + result);
    }
}
