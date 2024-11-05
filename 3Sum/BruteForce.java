import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BruteForce {
    public List<List<Integer>> threeSum(int[] nums) {
        //List<List<Integer>> ans = new ArrayList<>();
        

        Set<List<Integer>> innerList = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            
            for(int j=i+1; j<nums.length; j++)
            {
                for(int k=j+1; k<nums.length; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == 0) 
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        innerList.add(temp);
                    }
                  
                }
            }
        }
       // List<Integer> innerLists = new ArrayList<>(innerList);
       List<List<Integer>> ans = new ArrayList<>(innerList);
        return ans;
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int n = ss.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();

        BruteForce obj1 = new BruteForce();
        
        System.out.println(obj1.threeSum(arr));

        
    }
}
