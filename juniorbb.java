import java.util.Scanner;

public class juniorbb {
    public static void main(String[] args) {
       
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite seu nome:");
    String nome = entrada.nextLine();
    System.out.print("Digite seu sobrenome:");
    String sobrenome = entrada.nextLine();
    System.out.print("Qual e sua idade?");
    int idade = entrada.nextInt();

    System.out.printf("%s %s \n minha idade e %d anos", nome, sobrenome, idade);

    entrada.close();

        
        
    }
    
}
