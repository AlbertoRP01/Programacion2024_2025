import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej4Boletin_Arrays {
    static Scanner sc = new Scanner(System.in);
    static final int TAMANNO = 6000;

    public static void main(String[] args) {
        Random random = new Random();
        int[] miArray = new int[TAMANNO];
        rellenaArray(miArray);
        calcularMedia(miArray);
        numeroTerminacionMax(miArray);

    }

    /**
     * Rellena con numeros aleatorios el array pasado como parametro.
     * Los numeros aleatorios serán del 0 al 100
     *
     * @param miarray
     */
    public static void rellenaArray(int[] miarray) {
        for (int i = 0; i < miarray.length; i++) {
            miarray[i] = (int) (Math.random() * 101);
        }
    }

    private static double calcularMedia(int[] miArray) {
        int media = 0;
        for (int i = 0; i < miArray.length; i++) {
            media += miArray[i];
        }
        return (double) media / miArray.length;
    }


    private static void numeroTerminacionMax(int[] array) {
        int[] repeticionTerminaciones = new int[10];

        for (int i = 0; i < array.length; i++) {
            int digitoTermina = array[i] % 10;
            repeticionTerminaciones[digitoTermina]++;
        }
        int max = 0;
        int indiceMax = -1;
        for (int i = 0; i < repeticionTerminaciones.length; i++) {
            if (repeticionTerminaciones[i] < max) {
                max = repeticionTerminaciones[i];
                indiceMax = i;
            }
        }
        System.out.println(Arrays.toString(repeticionTerminaciones));
    }

    private static void numeroTerminacionNula(int[] array) {
        
    }

}
