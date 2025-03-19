package com.mycompany.vazio;

import java.util.Scanner;

public class Vazio {

 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 
    System.out.println("Digite uma frase: ");
    String texto = teclado.nextLine();
    
    boolean contem = texto.contains("a");
    boolean vazio = texto.isBlank();
    
    System.out.println("o texto contem a letra a?:" + contem);
    System.out.println("o texto esta vazio?" + vazio);
    

    
    
    }
}