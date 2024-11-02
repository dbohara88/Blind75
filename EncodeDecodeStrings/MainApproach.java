import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApproach {
    public String encode(List<String> strs) {
        // String ans = "";
        
        // for(int i=0; i<strs.size(); i++)
        // {
        //     String seq = strs.get(i);
        //     ans += seq.length()+"#"+seq;
        // }
        // return ans;

        //StringBuilder is mutable string in java
        StringBuilder ans = new StringBuilder();

        for(String str : strs) ans.append(str.length()).append('#').append(str);

        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i = 0;
        while(i < str.length()) 
        {
            int index = str.indexOf('#', i);
            int size = Integer.parseInt(str.substring(i, index));
            
            i = index + size + 1;

            ans.add(str.substring(size+1, i));
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner ss = new Scanner(System.in);

        int n = ss.nextInt();
        List<String> str1 = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
          String input = ss.next();
          str1.add(input);
        }

        MainApproach obj1 = new MainApproach();
        
        String dec = obj1.encode(str1);
        
        List<String> ans = obj1.decode(dec);
        
        for(String i: ans) 
            System.out.print(i+" ");
    }
}
