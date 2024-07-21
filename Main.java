import java.util.Arrays;

public class Main {
    public static void reverse(int[] a) {
        int start = 0, end = a.length - 1;
        while(start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
