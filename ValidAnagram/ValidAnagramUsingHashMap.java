
/*
 Time Complexity: O(n^2)
 Space Complexity: O(1)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagramUsingHashMap {

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp1 = new HashMap<>();
        if(s.length() != t.length())
            return false;
        
        //incrementing the values
        for(char c: s.toCharArray())
        {
            mp1.put(c, mp1.getOrDefault(c, 0) +1);
        }

        //decrementing the values
        for(char c: t.toCharArray())
        {
            mp1.put(c, mp1.getOrDefault(c, 0)-1);
        }

        for(Map.Entry<Character, Integer> entry : mp1.entrySet())
        {
            if(entry.getValue() != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);
        String s1 = ss.nextLine();
        String s2 = ss.nextLine();

        ValidAnagramBruteForce obj = new ValidAnagramBruteForce();

        if(obj.isAnagram(s1, s2))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}
