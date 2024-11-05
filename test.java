import java.util.Scanner;

public class test {

    public String reverseString(String s) {

        int i = 0;
        char[] chars = s.toCharArray();
        int j = chars.length - 1;
        while(i<j) {
           char temp = chars[i];
           chars[i] = chars[j];
           chars[j] = temp;
           i++;
           j--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        String str = ss.nextLine();

        test obj1 = new test();
        System.out.println(obj1.reverseString(str));
    }
}
