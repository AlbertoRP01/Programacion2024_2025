public class Ej7_Matrices {
    public static void main(String[] args) {
        int[][] matriz = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] matriz2 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        if (reciboMatrices(matriz, matriz2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }

    public static boolean reciboMatrices(int[][] matriz1, int[][] matriz2) {
        boolean vaLor = false;
        boolean h = false;
        int comparador = 0;
        int contador = 0;
        for (int i = 0; i < matriz1[0].length; i++) {
            if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[i].length) {


                for (int j = 0; j < matriz1.length; j++) {
                    contador++;

                    if (matriz1[i][j] == matriz2[i][j]) {
                        comparador++;

                    }
                }
            } else {
                h = true;

            }
        }
        if (contador == comparador && h == false) {
            vaLor = true;
        }
        return vaLor;

    }
}
