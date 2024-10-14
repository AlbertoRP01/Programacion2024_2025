import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej4_Boletin2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(501 % 24);
        int h1 = 0, m1 = 0, s1 = 0;
        int h2 = 499, m2 = 169, s2 = 100;
        int hf = h1, mf = m1, sf = s1;
        int dias;
        /*
        Sumamos los segundos resultantes de tomar el resto entre  los 60 segundos que tiene un minuto

         */
        sf = (s1 + s2) % 60;
        /*
        En caso de que se acarree algún minuto, lo sumamos a los minutos. Sumamos a los minutos
         finales.( que ya tienen sumando el acarreo) el resto de dividor dicho numero
         más los minutos añadidos entre los 60 minutos qu tiene una hora
         */
        //En caso de que se acarree algún minuto, lo sumamos a los minutos. Sumamos a los minutos finales.
        mf += (s1 + s2) / 60;
        /*

         */
        hf += (mf + m2) / 60;
        /*
        Ahora
         */
        mf = (mf + m2) % 60;

        dias = (hf + h2) / 24;

        hf = (hf + h2) % 24;


        System.out.printf("La hora resultante es %02d:%02d:%02d +%d dias",
                hf, mf, sf, dias);
        ;
    }
}
