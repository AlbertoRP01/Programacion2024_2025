import java.util.Random;

public class Ej11_Boletin_Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] array2 = {7, 2, 4, 9};
        int[] array3 = elementosComunes(array, array2);
    }

    private static int buscarElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }

        }

        return -1;
    }

    private static int[] elementosComunes(int[] array1, int[] array2) {

        int indice = 0;
        int[] nuevoArray2 = new int[indice];//contiene el indice de los arrays
        int[] nuevoArray = new int[array1.length];//contiene los elementos del primer array
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; i++) {
                if (array1[i] == array2[j]) {
                    nuevoArray[i] = array1[i];
                    indice++;

                }
            }

        }
        for (int i = 0; i < indice; i++) {
            nuevoArray2[i] = nuevoArray[i];
        }
        return nuevoArray2;
    }

}
