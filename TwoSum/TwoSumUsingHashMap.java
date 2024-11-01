
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
 Time Complexity: O(n)
 Time Complexity: O(n)
*/

public class TwoSumUsingHashMap {
    public int[] twoSum(int[] nums, int target) {
 
        Map<Integer, Integer> mp1 = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            int complement = target - nums[i];
            if(mp1.containsKey(complement))
            {
                return new int[] {mp1.get(complement), i};
            }
            mp1.put(nums[i], i);
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
