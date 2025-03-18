package salariominimo;
import java.util.Scanner;

public class salariominimo {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o seu salario: ");
    int salario = teclado.nextInt();
    int sm = salario / 1412;
    System.out.println("a sua quantidade de salarios minimos é de : " + sm);
    
    }
}

       
