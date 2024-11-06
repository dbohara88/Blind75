import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BruteForce {
    public int maxProfit(int[] prices) {
        List<Integer> maxProfit = new ArrayList<>();
        int initialPrice = prices[0];
        
        for(int i=1; i<prices.length; i++)
        {
            if(initialPrice > prices[i])
            {
                initialPrice = prices[i];
            }
            else {
                maxProfit.add(prices[i] - initialPrice);
            }
        }
        if(maxProfit.isEmpty()) return 0;
        else {
            Collections.sort(maxProfit);
           return maxProfit.get(maxProfit.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();

        BruteForce obj1 = new BruteForce();

        System.out.println(obj1.maxProfit(arr));

    }
}
