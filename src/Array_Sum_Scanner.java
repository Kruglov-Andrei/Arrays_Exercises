import java.util.Scanner;
//Ввести с клавиатуры 10 вещественных чисел в массив и найти сумму этих чисел.
public class Array_Sum_Scanner {
    public static void main(String[] args) {
        double[] a = new double[5];
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пять вещественных чисел: ");
        for (int i = 0; i < a.length; i++) {
            if (sc.hasNextDouble()) {
                a[i] = sc.nextDouble();
            } else {
                System.out.println("Вы ввели неверное число");
            }
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
            System.out.println("Сумма элементов массива = " + sum);
        }
    }
