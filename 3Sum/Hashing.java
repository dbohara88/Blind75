import java.util.ArrayList;
import java.util.Scanner;

public class Hashing {
    public List<List<Integer>> threeSum(int[] nums) {
    return new ArrayList<>();
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int n = ss.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();

        Hashing obj1 = new Hashing();
        
        System.out.println(obj1.threeSum(arr));
    }
}
