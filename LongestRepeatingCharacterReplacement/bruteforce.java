import java.util.Scanner;

public class bruteforce {
    public int characterReplacement(String s, int k) {
        
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        String str = ss.nextLine();
        int k = ss.nextInt();
        
        bruteforce obj1 = new bruteforce();

        System.out.println(obj1.characterReplacement(str, k));
    }
}
