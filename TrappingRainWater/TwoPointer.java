

import java.util.Scanner;

public class TwoPointer {
    public int trap(int[] height) {
        
        int ans = 0;

        int i =0;
        int j = height.length - 1;

        int leftMax = height[i];
        int rightMax = height[j];

        while(i < j) {

            if (leftMax <= rightMax) {
                i++;
                leftMax = Math.max(leftMax, height[i]);
                ans += leftMax - height[i];
            }
            else {
                j--;
                rightMax = Math.max(rightMax, height[j]);
                ans += rightMax - height[j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
                Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();

        TwoPointer obj1 = new TwoPointer();

        System.out.println(obj1.trap(arr));
    }   
}
