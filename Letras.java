package com.mycompany.letras;
import java.util.Scanner;

public class Letras {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite sua frase: ");
    String frase = teclado.nextLine();
    int tamanho = frase.length();
    boolean maior = tamanho > 15;
    System.out.println("sua frase: " + frase);
    System.out.println(frase + " tem " + tamanho + " caracteres");
    System.out.println("Tem mais de 15 letras? " + maior);

    
    
    }
}