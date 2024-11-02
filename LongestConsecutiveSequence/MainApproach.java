import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MainApproach {
    public int longestConsecutive(int[] nums) {
     
        int max = 0;
        Set<Integer> hs = new HashSet<>();

        for(int it: nums) hs.add(it);

        for(int num: hs)
        {
            if(!hs.contains(num-1)) {
                int h = num;
                int c = 1;

            while(hs.contains(h+1)) {
                h++;
                c++;
            }
            max = Math.max(max, c);
        }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int size = ss.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++)
        {
            arr[i] = ss.nextInt();
        }

        MainApproach obj1 = new MainApproach();
        System.out.println(obj1.longestConsecutive(arr));       
    }
}
