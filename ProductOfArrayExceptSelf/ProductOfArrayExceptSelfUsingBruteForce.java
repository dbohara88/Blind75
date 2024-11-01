
import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelfUsingBruteForce {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            int rand = 1;
            for(int j=0; j<nums.length; j++)
            {
                if(i != j)
                    rand *= nums[j]; 
            }
            ans[i] = rand;
        }
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
