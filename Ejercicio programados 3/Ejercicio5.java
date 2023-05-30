import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double miles, kilometers;
        System.out.print("Introduce una cantidad de millas (0 para salir): ");
        miles = entrada.nextDouble();
        while (miles != 0) {
            kilometers = miles * 1.6093;
            System.out.println(miles + " millas equivalen a " + kilometers + " kilómetros.");
            System.out.print("Introduce una cantidad de millas (0 para salir): ");
            miles = entrada.nextDouble();
        }
        entrada.close();
    }
}
      
    
