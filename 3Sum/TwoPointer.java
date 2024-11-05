import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoPointer {

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j  = i +1;
            int k = nums.length - 1;
            while(j < k) {
                int currentVal = nums[i] + nums[j] + nums[k];
                
                if(currentVal > 0) k--;
                else if(currentVal < 0) j++;
                else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j<k) j++;

                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int n = ss.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();
        TwoPointer obj1 = new TwoPointer();

        System.out.println(obj1.threeSum(arr));
    }
}
