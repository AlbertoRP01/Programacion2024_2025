import java.util.Random;

public class Ej7_Boletin_Arrays {
    public static void main(String[] args) {
        int[]array = new int[100];
        inicializArrayAleatorio(array);
        if (contieneElemento(array)){
            System.out.println("el numero 10 está en el array");

        }else
            System.out.println("el numero no está en el array");
    }
    private static  boolean contieneElemento(int[] array){
        Random random = new Random();
        boolean encontrado = false;
        for (int i = 0; i < array.length && !encontrado; i++){
            encontrado = true;
        }
        return encontrado;
    }


    private static void inicializArrayAleatorio(int[]array){
        Random random = new Random();
        for (int i = 0; i <array.length; i++){
            array[i] = random.nextInt(101);
        }
    }
}

