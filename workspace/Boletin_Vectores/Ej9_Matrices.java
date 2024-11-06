public class Ej9_Matrices {
    public static void main(String[] args) {
        int[][] matriz = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        if (matrizSimetrica(matriz)) {
            System.out.println("Es simetrica");
        }else {
            System.out.println("No es simetrica ");
        }
    }

    public static boolean matrizSimetrica(int[][] matriz) {

        boolean simetrica = false;
        int contador = 0;
        int contador2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i].length == matriz.length) {
                contador++;
            }
            contador2++;
        }
        if (contador2 == contador) {
            simetrica = true;

        }
        return simetrica;
    }
}
