import javax.swing.JOptionPane;

public class Udemy {
    
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro nome: ");
                
                String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo nome: ");

                //System.out.print("Seu nome é: " + valor1);
                //System.out.println("\nSeu sobrenome e: " + valor2);

                System.out.println(valor1 + valor2);

                double numero1 = Double.parseDouble(valor1);
                double numero2 = Double.parseDouble(valor2);
                double soma = numero1 + numero2;  

                System.out.println("soma e: " + soma);
                System.out.println("A media é: " + soma / 2);


    }
    
}
