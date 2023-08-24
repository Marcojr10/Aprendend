import java.util.Date;

public class estudos {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        java.lang.String b = ("Bom dia");
        System.out.println(b);

        String d = "Bom dia";
        System.out.println(d);

        Date s = new Date();
        System.out.println(s);

        var nome = "Marco";
        var sobrenome = "Junior";
        var idade = 26;
        var altura = 1.70;

        System.out.printf("Meu nome é %s %s tenho %d e %.2f de altura.", nome, sobrenome, idade, altura);

        String n =String.format("Meu nome é %s %s tenho %d e %.2f de altura.", nome, sobrenome, idade, altura, args);
        System.out.println(n);

        String l = "Boa tarde";
        System.out.println(l);
       



       

    }
    
}
