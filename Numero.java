package com.mycompany.numero;
import java.util.Scanner;

public class Numero {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); // escaneia seus inputs no teclado
    
    System.out.println("Digite um numero: "); // aparece a frase digite um numero na tela
    int x1 = teclado.nextInt(); // aqui vc vai poder digitar o primeiro numero
    System.out.println("Digite outro numero: "); // aparece a frase para digitar outro numero
    int x2 = teclado.nextInt(); // aqui vc vai poder digitar o outro numero
    
    int soma = x1 + x2; // o calculo que soma as variaveis
    int multi = x1 * x2; //o calculo que faz multiplicar as variaveis
    System.out.println("numero da soma e: " +soma); // aparece na tela a frase numero da soma + a soma que o computador fez
    System.out.println("numero da multiplicacao e: " +multi); // aparece na tela a frase numero da multiplicacao + a multiplicacao que o computador fez
    
    
    boolean igual = x1 == x2; // verifica se as variaveis são iguais
    System.out.println("os numeros sao iguais?: " +igual); // aparece a frase os numeros sao iguais + a verificação se o numeros são iguais true pra sim e false pra não
    boolean maior = soma > 20; //verifica se a soma das 2 variaveis é maior que 20, se sim vai aparecer true, se não false
    System.out.println("a soma dos dois numeros e maior que 20?: " +maior); // aparece a frase a soma dos dois numeros é maior que 20? + a verificação se é maior ou não
    
    

    
    
    }
}