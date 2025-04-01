package com.mycompany.aluno;
import java.util.Scanner;

public class Aluno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   
        System.out.println("Insira a sua nota!");
        int n = teclado.nextInt();
        System.out.println("Sua nota é: " + n); 
        if (n > 7) { 
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        teclado.close(); // Fecha o Scanner para evitar vazamento de recursos
    }
}
