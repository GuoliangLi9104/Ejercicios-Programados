import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        boolean esMultiploDeTres = (numero % 3 == 0);
        boolean esMultiploDeCinco = (numero % 5 == 0);

        if (esMultiploDeTres && esMultiploDeCinco) {
            System.out.println(numero + " es múltiplo de tres y de cinco.");
        } else if (esMultiploDeTres) {
            System.out.println(numero + " es múltiplo de tres.");
        } else if (esMultiploDeCinco) {
            System.out.println(numero + " es múltiplo de cinco.");
        } else {
            System.out.println(numero + " no es múltiplo de tres ni de cinco.");
        }
    }
}
      
      
    
