import java.util.Scanner;

public class BruteForce {
    public int trap(int[] height) {
        
        int ans = 0;

        for(int i=0; i<height.length; i++) {
            int leftMax = height[i];
            int rightMax = height[i];

            for(int j=0; j<i; j++) leftMax = Math.max(leftMax, height[j]);

            for(int j=i+1; j<height.length; j++) rightMax = Math.max(rightMax, height[j]);

            ans += Math.min(leftMax, rightMax) - height[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();

        BruteForce obj1 = new BruteForce();

        System.out.println(obj1.trap(arr));
    }
}
