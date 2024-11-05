import java.util.Scanner;

public class TwoPointer {
    public int maxArea(int[] height) {

        int ans = Integer.MIN_VALUE;

        int i = 0;
        int j = height.length - 1;
        while(i < j) {
            int currentVal = Math.min(height[i], height[j]) * (j-i);
            ans = Math.max(ans, currentVal);
            if(height[i] <= height[j]) {
                i++;
            }
            else {
                j--;
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

       System.out.println(obj1.maxArea(arr));
    }
}
