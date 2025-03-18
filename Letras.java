package com.mycompany.letras;
import java.util.Scanner;

public class Letras {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); // scanner que verifica os seus inputs no teclado para formular uma frase
    System.out.println("Digite sua frase: "); //parte onde vc vai digitar a sua frase
    String frase = teclado.nextLine(); //sua frase que vai aparecer na tela
    int tamanho = frase.length(); // verifica o tamanho da frase
    boolean maior = tamanho > 15; // se o tamanho for maior que 15 letras vai ser false
    System.out.println("sua frase: " + frase); // mostra a frase que vc digitou anteriormente
    System.out.println(frase + " tem " + tamanho + " caracteres"); // mostra quantos caracteres forma a sua frase
    System.out.println("Tem mais de 15 letras? " + maior); // e verifica se sua frase tem mais de 15 letras 

    
    
    }
}
