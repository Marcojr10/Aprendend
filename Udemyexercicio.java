import java.util.Scanner;

public class Udemyexercicio {
    public static void main(String[] args) {
	   
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu primeiro salario:");
		String valor1 = entrada.next().replace(",",".");
		
		System.out.println("\nInforme seu segundo salario:");
		String valor2 = entrada.next().replace(",",".");
		
		System.out.println("\nInforme seu terceiro salario:");
		String valor3 = entrada.next().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A media dos salario e:" + soma);
		
		
		entrada.close();
    
    }
}
