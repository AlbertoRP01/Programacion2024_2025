import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej9_Boletin_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {9, 4, 8, 2, 3, 6, 7};



    }

    public static void generaArray(int[] array, boolean reverse) {
        int temporal = 0;
        if (reverse) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        temporal = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temporal;

                    }
                }
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] < array[j + 1]) {
                        temporal = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temporal;

                    }
                }
            }
        }
    }
}
