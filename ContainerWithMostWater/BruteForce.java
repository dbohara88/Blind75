import java.util.Scanner;

public class BruteForce {
    public int maxArea(int[] heights) {
        
        int mx = Integer.MIN_VALUE;

        for(int i=0; i<heights.length; i++)
        {
            for(int j=i+1; j<heights.length; j++)
            {
                int currentVal = Math.min(heights[i], heights[j]) * (j-i);
                mx = Math.max(currentVal, mx);
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int n = ss.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();
        BruteForce obj1 = new BruteForce();

       System.out.println(obj1.maxArea(arr));
        
    }
}
