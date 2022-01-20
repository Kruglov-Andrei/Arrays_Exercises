import java.util.Arrays;
import java.util.Collections;

public class Array_Sort_Down {
    public static void main(String[] args) {
        Double[] a = new Double[10];
        double n1 = -100.99;
        double n2 = 100.99;
        System.out.println("Массив из случайных чисел в диапазоне -100.99-100.99");
        for (int i = 0; i < a.length; i++){
            a[i] = (double)(Math.random() * ((n2 - n1) + 1)) + n1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Массив отформатирован");
        for (int i = 0; i < a.length; i++){
            System.out.format("%.3f ", a[i]);
        }
        System.out.println();
        System.out.println("Массив отсортирован по убыванию");
        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < a.length; i++){
            System.out.format("%.3f ", a[i]);
        }
    }
}
