
//Ques:- Find the unique number in a given Array where all the elements are being repeated twice with one value being unique.
//i) Traverse all pairs
//ii) Equal Pairs -> mark -1
//iii) Traverse array again value>0 is over answer

import java.util.Scanner;
public class p81 {
    static int findUnique(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENter "+n+" Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unique Element: "+findUnique(arr));
    }
}
