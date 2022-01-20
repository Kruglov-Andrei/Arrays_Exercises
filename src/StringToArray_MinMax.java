import java.util.Arrays;
import java.util.OptionalInt;

    public class StringToArray_MinMax {
        public static void main(String[] args){

            String str = "11 34 3 -45 23 5 67";
            String strArr[] = str.split(" ");
            int numArr[] = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                numArr[i] = Integer.parseInt(strArr[i]);
                System.out.print(numArr[i] + " ");
            }
            OptionalInt min = Arrays.stream(numArr).min();
            OptionalInt max = Arrays.stream(numArr).max();

            System.out.println();
            System.out.println(min);
            System.out.println(max);
            System.out.println("Минимальное значение " + Arrays.stream(numArr).min());
            System.out.println("Максимальное значение " + Arrays.stream(numArr).max());
        }
    }

