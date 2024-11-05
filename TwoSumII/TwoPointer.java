import java.util.Scanner;

public class TwoPointer {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int r = numbers.length-1;

        while(i<r) {
            int currentVal = numbers[i] + numbers[r];
            if(currentVal > target) r--;
            else if(currentVal < target) i++;
            else return new int[]{numbers[i], numbers[r]};
        }
        throw new IllegalArgumentException("No result found!");
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int n = ss.nextInt();
        int target = ss.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = ss.nextInt();

        TwoPointer obj1 = new TwoPointer();

        System.out.println(obj1.twoSum(arr, target));
    }
}
