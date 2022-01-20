import java.util.Arrays;

public class Array_DeepToString {
    public static void main(String[] args) {
        int[][] aa = {{1, 2, 3, },{4, 5, 6, },{7, 8, 9}};
        char[][] ch = new char[][]{
                {'a','b','c'},{'d','e','f'},{'g','h','i'}};
        System.out.println("Array aa: " + Arrays.deepToString(aa));
        System.out.println("Array ch: " + Arrays.deepToString(ch));
    }
}
