

//Ques: Calculate the  maximum value of all the element in the array.
//      input: arr[] = {1,5,7,8,9}
//      output: 9



public class p78 {
    public static void main(String[] args) {
        
        int[] arr = {1, 5, 7, 8, 9}; // input array   Ek integer array arr banaya gaya hai jisme values {1, 5, 7, 8, 9} hai.
        
        int max = findMax(arr);     //findMax method ko call karke array ka maximum value nikal rahe hain aur max variable mein store kar rahe hain.
        
        System.out.println("The maximum value in the array is: " + max);
    }

    public static int findMax(int[] arr) {      //Method Declaration: public static int findMax(int[] arr): Yeh method array ko input leta hai aur ek integer return karta hai.
       
        int max = arr[0]; // Initialize max with the first element. Initialize max: int max = arr[0];:Pehli element ko max set kar dete hain.
        
        for (int i = 1; i < arr.length; i++) {      //Array ke second element se loop shuru karte hain aur har element ko check karte hain.
           
            if (arr[i] > max) {             //Agar current element max se bada hai, toh max ko update kar dete hain.
                
                max = arr[i]; // Update max if the current element is greater
            }
        }
        return max;         //Agar current element max se bada hai, toh max ko update kar dete hain.
    }
}
