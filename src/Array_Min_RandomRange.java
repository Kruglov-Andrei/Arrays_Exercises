import java.util.Arrays;
import java.util.Random;

/*Найти наименьший элемент одномерного массива размерностью 10
и определить его номер.
Массив заполнить случайным образом в диапазоне [-50-50].*/
public class Array_Min_RandomRange {
    public static void main(String[] args) {
        int[] a = new int[10];
        int n1 = -50;
        int n2 = 50;
        int min, n_min;
        Random rand = new Random();
        for (int i = 0; i < a.length; i++){
            a[i] = n1 + rand.nextInt(n2 - n1 + 1);
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        min = a[0];
        n_min = 0;
        for (int i = 1; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
                n_min = i;
            }
        }
        System.out.println("наименьший элемент массива = " + min);
        System.out.println("Номер наименьшего элемента массива = " + n_min);
    }
}
