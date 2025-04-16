package Multi;
import java.util.Scanner;

public class Multi {

    public static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(i + " x " + numero + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        tabuada(10);
    }
}
