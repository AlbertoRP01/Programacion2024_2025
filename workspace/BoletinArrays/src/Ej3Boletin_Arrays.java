import java.util.Scanner;

public class Ej3Boletin_Arrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int tamanno;
        do {
            System.out.println("¿Cuantos elementos quieres que tenga el array?");
            tamanno = sc.nextInt();
        } while (tamanno <= 0);
        int[] array = new int[tamanno];
        rellenararray(array);

        int mayor = maxNum(array);
        int contador = contMax(array, mayor);
        System.out.println("El mayor es" + mayor + " se repite " + contador + " veces ");
        int menor = minNum(array);
        int segundoCont = contMin(array, menor);
        System.out.println("El menor es " + menor + ", se repite " + segundoCont + " veces ");
        double media = media(array);
        System.out.println("La media es " + media);
    }

    private static void rellenararray(int[] array) {
        int valor;
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Introduce un valor ");
            valor = sc.nextInt();
            array[i] = valor;
        }
    }

    private static double media(int[] array) {
        double media = 0;
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            media = (double) suma / array.length;
        }
        return media;
    }

    private static int maxNum(int[] array) {
        int mayor = array[0];
        int contador = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    private static int contMax(int[] array, int mayor) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == mayor) {
                contador++;
            }
        }
        return contador;
    }

    private static int minNum(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (menor < array[i]) {
                menor = array[i];

            }
        }
        return menor;
    }

    private static int contMin(int[] array, int menor) {
        int segundoCont = 0;
        for (int i = 0; i < array.length; i++) {
            if (menor == array[i]) {
                segundoCont++;
            }
        }
        return segundoCont;
    }
}
