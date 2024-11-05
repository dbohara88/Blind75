import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) 
    {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num: nums) map.put(num, map.getOrDefault(num, 0) + 1);
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue()- a.getValue());
        
        for(Map.Entry entry: map.entrySet()) pq.add(entry);

        int[] ans = new int[k];
        for(int i=0; i<k; i++)
        {
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner ss = new Scanner(System.in);

        int size = ss.nextInt();
        int k = ss.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++)
        {
            arr[i] = ss.nextInt();
        }

        TopKFrequentElements obj1 = new TopKFrequentElements();
        int[] ans  = obj1.topKFrequent(arr, k);

        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
