public class Ej6_Matrices {
    public static void main(String[] args) {
        devolverMatriz();

    }

    public static void devolverMatriz() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};

        for (int j = matriz[0].length - 1; j >= 0; j--) {

            for (int i = matriz.length - 1; i >= 0; i--) {

                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
