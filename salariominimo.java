package salariominimo;
import java.util.Scanner; 

public class salariominimo {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o seu salario: ");
    int salario = teclado.nextInt(); //salario do funcionario
    int sm = salario / 1412; // calculo para transformar seu salario em quantidades de salarios minimos 1412 = 1sm 
    System.out.println("a sua quantidade de salarios minimos é de : " + sm); // exibe a quantidade de salarios minimos na tela
    
    }
}

       
