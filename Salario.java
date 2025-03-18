package com.mycompany.salario1;
import java.util.Scanner;
public class Salario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira seu Salario: ");
        double sm = teclado.nextDouble(); //salario
        double sa = sm * 1.1; // o salario com o aumento de 10%
        double aumento = sm * 0.1; // somente o aumento de 10%
    System.out.println("salario com os 10% de aumento e: " + sa);
    System.out.println(aumento + "de aumento " );



    }
}
