import java.util.Scanner;

public class BetterApproach {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] ans = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = 1;
        for(int i=1; i<n; i++) left[i] = left[i-1] * nums[i-1];
        
        right[n-1] = 1;
        for(int i=n-2; i>=0; i--) right[i] = right[i+1] * nums[i+1];
        
        for(int i=0; i<n; i++) ans[i] = left[i] * right[i];
        return ans;
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int size = ss.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++)
        {
            arr[i] = ss.nextInt();
        }

        ProductOfArrayExceptSelfUsingBruteForce obj1 = new ProductOfArrayExceptSelfUsingBruteForce();
        int[] ans  = obj1.productExceptSelf(arr);

        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }        
    }
}
