import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BruteForce01 {
        public int maxProfit(int[] prices) {

            int ans = 0;
            int initialPrice = prices[0];

            for(int i=1; i<prices.length; i++)
            {
                if(initialPrice > prices[i]) initialPrice = prices[i];
                else {
                    if(ans <= prices[i] - initialPrice) ans = prices[i] - initialPrice;
                }
            }
            
            return ans;
    } 
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();

        BruteForce01 obj1 = new BruteForce01();

        System.out.println(obj1.maxProfit(arr));
    }
}
