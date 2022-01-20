import java.util.Arrays;
import java.util.Random;

public class Array_Sort_Up {
    public static void main(String[] args) {
        int[] a = new int[10];
        int n1 = -105;
        int n2 = 155;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++){
            a[i] = n1 + rand.nextInt(n2 - n1 + 1);
            }
        System.out.println("Массив из случайных чисел в диапазоне -105-155");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
            }
        System.out.println();
        System.out.println("Массив отсортирован по возрастанию");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
