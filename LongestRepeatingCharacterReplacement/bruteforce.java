import java.util.Scanner;

public class bruteforce {
    public int characterReplacement(String s, int k) {
        int[] charsCount  = new int[26];
        int i = 0;
        int maxCount = 0;
        int ans = 0;

        for(int j=0; j<s.length(); j++) {
            charsCount[s.charAt(j)-'A']++;
            maxCount = Math.max(maxCount, charsCount[s.charAt(j)-'A']);

            while(j-i+1-maxCount > k) {
                charsCount[s.charAt(i)-'A']--;
                i++;
            }
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        String str = ss.nextLine();
        int k = ss.nextInt();
        
        bruteforce obj1 = new bruteforce();

        System.out.println(obj1.characterReplacement(str, k));
    }
}
