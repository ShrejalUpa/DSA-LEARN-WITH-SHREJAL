//Pascal Triangle
//Ques- Given an integer n return the first n rows of pascal's triangle. In Pascal's triangle, each nummber is the sum of the two numbers directly above it as shown. for n=5

public class p107 {

    public static int[][] pascal(int n) {
        // Create a 2D array to hold Pascal's triangle
        int[][] ans = new int[n][];
        
        // Loop to generate each row
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1]; // No. of columns in the row = i + 1
            
            // First and last elements of each row are 1
            ans[i][0] = ans[i][i] = 1;
            
            // Fill in the middle elements
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int[][] result = pascal(n);
        
        // Print Pascal's Triangle
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
