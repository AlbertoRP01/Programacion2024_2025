

public class Ej14_Boletin_Arrays {
    private static int[] cola;
    private static int numElementos = 0;
    public static final int TAMANNO = 5;
    private static int ipe = 0;//Indice del primer elemento

    public static void main(String[] args) {
        cola = new int[TAMANNO];
        encolar(7);
        encolar(1);
        encolar(4);
        encolar(2);
        encolar(5);
        encolar(8);
        System.out.println(desencolar2());
        System.out.println(desencolar2());
        System.out.println(desencolar2());
        System.out.println(desencolar2());
        System.out.println(desencolar2());
        System.out.println(desencolar2());


    }

    public static void encolarElementos1(int n) {
        if (numElementos < TAMANNO) {
            cola[numElementos++] = n;

        } else {
            System.out.println("La cola está llena");
        }
    }

    public static int desencolar2() {
        int elementoDevolver = 0;
        if (numElementos == 0) {
            System.out.println("La cola está vacía");
        } else {
            elementoDevolver = cola[0];
            for (int i = 0; i < numElementos - 1; i++) {
                cola[i] = cola[i + 1];

            }
            numElementos--;
        }
        return elementoDevolver;
    }

    public static void encolar(int n) {
        if (numElementos == TAMANNO) {
            System.out.println("La cola está llena");
        } else {
            cola[(ipe + numElementos++) % TAMANNO] = n;
            numElementos = numElementos + 1;
        }
    }

    public static int desencolar() {
        int elementoDevolver = 1;
        if (numElementos == 0) {
            System.out.println("La cola está vacía");

        } else {
            elementoDevolver = cola[ipe];
            ipe = (ipe + 1) % TAMANNO;
            numElementos = numElementos -1;

        }
        return elementoDevolver;
    }
}
