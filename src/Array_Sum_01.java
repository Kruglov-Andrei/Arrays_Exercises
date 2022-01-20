/*Написать программу, которая вычисляет сумму
элементов одномерного массива из 10 чисел.
Значения элементов массива задаются в программе*/
public class Array_Sum_01 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Сумма элементов массива " + sum);
    }
}
