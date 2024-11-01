import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicateUsingHashSet {
    public boolean hasDuplicate(int[] nums)
    {
        Set<Integer> hs = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++)
        {
            if(hs.contains(nums[i]))
            {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[4];

        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<4; i++)
        {
            arr[i] = sc.nextInt();
        }

        ContainsDuplicate cd = new ContainsDuplicate();
        if(cd.hasDuplicate(arr))
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }
    }
}
