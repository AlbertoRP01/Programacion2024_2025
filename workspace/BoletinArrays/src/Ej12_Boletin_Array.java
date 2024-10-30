import java.lang.reflect.Array;
import java.util.Arrays;

public class Ej12_Boletin_Array {
    public static void main(String[] args) {
        int[] array = {5, 2, 6, 3, 1, 9};
            ordenaBurbuja(array);
        System.out.println(Arrays.toString(array));
    }

    public static void ordenaBurbuja(int[] array) {
        int temporal = 0;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - 1 -i; j++) {
                if (array[j ] > array[j+1]) { //Al principio j se refiere a la posicio 1, i se refiere a la posicion
                    temporal = array[j];// Guardo en el temporal el valor del primer elemento
                    array[j] = array[j+1];// El primer elemento toma el valor del ssegundo
                    array[j+1] = temporal;//El segundo elemento toma el valor del pirmer elemento Gracuas A LA
                }
                //System.out.println(Arrays.toString(array));
            }
        }

    }
}
