import java.util.Random;
import java.util.Scanner;

public class Ej8_Boletin_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int resultado = posicionArray(array, numero);

        System.out.println(resultado);
    }


    private static void inicializaArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    private static int posicionArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }

        }
        return -1;
    }
}
