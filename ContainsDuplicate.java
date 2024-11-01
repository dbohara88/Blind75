import java.util.Scanner;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums)
    {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j])
                    return true;
            }
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