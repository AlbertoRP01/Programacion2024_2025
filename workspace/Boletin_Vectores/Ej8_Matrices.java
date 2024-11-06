public class Ej8_Matrices {
    public static void main(String[] args) {
        int[][] matriz = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] matriz2 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        sumarMatrices(matriz, matriz2);
    }


    public static int[][] sumarMatrices(int[][] matriz, int[][] matriz2) {
        int[][] suma = matriz;
        if (compararMatrices(matriz, matriz2)) {
            for (int i = 0; i < matriz[0].length; i++) {


                for (int j = 0; j < matriz.length; j++) {

                    suma[i][j] = matriz[i][j] + matriz2[i][j];
                    System.out.print(suma[i][j] + " ");
                }
            }
        } else {
            System.out.println("No son iguales ");
        }
        return suma;
    }

    public static boolean compararMatrices(int[][] matriz, int[][] matriz2) {
        boolean validador = false;


        for (int i = 0; i < matriz.length; i++) {
            validador = false;
            if (matriz.length == matriz2.length && matriz[0].length == matriz2[i].length) {
                validador = true;
            }
        }
        return validador;
    }
}
