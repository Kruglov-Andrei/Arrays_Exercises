import java.util.Arrays;
import java.util.Random;

public class Array_Sort_Part {
    public static void main(String[] args) {
        int[] a = new int[10];
        int n1 = -120;
        int n2 = 120;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++){
            a[i] = n1 + rand.nextInt(n2 - n1 + 1);
        }
        System.out.println("Массив из случайных чисел в диапазоне -120-120");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Элементы массива с индексами 0-5 отсортированы по возрастанию");
        Arrays.sort(a, 0, 6);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
