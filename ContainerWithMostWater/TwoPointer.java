import java.util.Scanner;

public class TwoPointer {
    public int maxArea(int[] height) {

        int ans = Integer.MIN_VALUE;

        for(int i=0; i<height.length; i++)
        {
            int j = 1 + 1;
            int currentVal = (Math.min(height[1], height[j])) * (j-1);
            if(currentVal > ans)
        }
    }
    public static void main(String[] args) {
        
        Scanner ss = new Scanner(System.in);

        int n = ss.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();
        TwoPointer obj1 = new TwoPointer();

       System.out.println(obj1.maxArea(arr));
    }
}
