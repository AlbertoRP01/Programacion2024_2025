import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class Ej10_BoletinArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nuevoArray = eliminarDuplicados(array);
        System.out.println(Arrays.toString(nuevoArray));
    }

    private static int buscarNumero(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }

        }
        return -1;
    }

    private static int[] eliminarDuplicados(int[] array) {
        int[] nuevoArray = new int[array.length];
        int indiceCopia = 0;
        for (int i = 0; i < array.length; i++) {
            if (buscarNumero(nuevoArray, array[i]) == -1) {
                nuevoArray[indiceCopia++] = array[i];


            }
        }
        return nuevoArray;
    }
}
