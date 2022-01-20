import java.util.Arrays;

public class Array_ToString {
    public static void main(String[] args) {
        String[] str = {"Red", "Blue", "Yellow"};
        System.out.println("This is the address: " + str);
        System.out.println("These are colours: " + Arrays.toString(str));
        int[] a = {1, 2, 5, 3, 9, 45, 26, 11, 4};
        System.out.println("Archive before sorting: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Archive after sorting: " + Arrays.toString(a));
    }
}
