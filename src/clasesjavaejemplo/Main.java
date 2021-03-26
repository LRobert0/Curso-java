import java.util.Scanner;

/**
 *
 * @author samyontiveros
 */

public class Main {


    public static void main(String args[]) {
        
        Calculadora calculadoraSamy = new Calculadora("cassio", Tipo.CIENTIFICA);

        float var1,var2;

        Scanner scanner = new Scanner(System.in);

        var1 = Float.parseFloat(scanner.nextLine());
        var2 = Float.parseFloat(scanner.nextLine());

        System.out.println("\t"+"Calculadora samy es de la marca: " + calculadoraSamy.getNombre() + "\t");

        
        System.out.println(calculadoraSamy.potencia(var1,var2));
    }
    
}
