/* Написать программу, которая вычисляет сумму
элементов одномерного массива размерностью  10,
заполненного случайным образом в диапазоне  [0-20]*/
import java.util.Random;

public class Array_Sum_RandomRange {
    public static void main(String[] args) {
        int[] a = new int[10];
        int n1 = 0;
        int n2 = 20;
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++){
            a[i] = n1 + rand.nextInt(n2 - n1 + 1);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Сумма чисел массива = " + sum);
    }
}
