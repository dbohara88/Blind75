import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class UsingSorting {
    public boolean isPalindrome(String s) {

        String m1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder m2 = new StringBuilder(m1).reverse();
        return m1.equals(m2.toString());
    }
    public static void main(String[] args) {
        
        Scanner ss = new Scanner(System.in);
        String str = ss.nextLine();

        UsingSorting obj1 = new UsingSorting();
        if(obj1.isPalindrome(str)) System.out.println("true");
        else System.out.println("false");
    }
}
