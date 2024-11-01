
import java.util.Scanner;


/*
 Time Complexity: O(n^2)
 Time Complexity: O(1)
*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No result found!");
    }

    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);
        int size = ss.nextInt();
        int target = ss.nextInt();

        int[] nums = new int[size];
        for(int i=0; i<size; i++)
        {
            nums[i] = ss.nextInt();
        }

        TwoSum obj1 = new TwoSum();
        int[] res = obj1.twoSum(nums, target);
        
        for(int i: res)
        {
            System.out.print(i+" ");
        }
    }
}
