import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
       Map<String, List<String>> mp1 = new HashMap<>();

       for(String it: strs)
       {
        char[] chars = it.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        
        if(!mp1.containsKey(sortedString))
        {
            mp1.put(sortedString, new ArrayList<>());
        }
        mp1.get(sortedString).add(it);
       }

       return new ArrayList<>(mp1.values());
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int size = ss.nextInt();

        String[] str1 = new String[size];

        for(int i=0; i<size; i++)
        {
            str1[i] = ss.nextLine();
        }
        
        GroupAnagram obj1 = new GroupAnagram();
        System.out.println(obj1.groupAnagrams(str1));
        
    }
}
