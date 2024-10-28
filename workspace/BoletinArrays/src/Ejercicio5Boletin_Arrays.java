import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5Boletin_Arrays {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el tamaño de un array");
        arrayAleatorio(sc.nextInt());
        sc.close();
    }

    private static void arrayAleatorio(int tamano) {
        int[] array = new int[tamano];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1001);

        }
        System.out.println(Arrays.toString(array));
    }
}