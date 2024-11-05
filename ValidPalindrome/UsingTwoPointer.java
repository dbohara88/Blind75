
import java.util.Scanner;

public class UsingTwoPointer {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = s.length() - 1; 

        while(i<=j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
                Scanner ss = new Scanner(System.in);
        String str = ss.nextLine();

        UsingTwoPointer obj1 = new UsingTwoPointer();
        if(obj1.isPalindrome(str)) System.out.println("true");
        else System.out.println("false");
    }
}
