public class Ej5_Matrices {
    public static void main(String[] args) {
    devolverMatriz();

    }

        public static void devolverMatriz () {

            int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
            for (int i = 0; i < matriz[0].length; i++) {


                for (int j = 0; j < matriz.length; j++) {


                    System.out.print(matriz[j][i] + " ");
                }
            }
        }


}
