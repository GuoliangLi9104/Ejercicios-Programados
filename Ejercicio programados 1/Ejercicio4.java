import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int numero1;
           int numero2;

           //Solicita los datos al usuario
           System.out.println("Escriba dos numeros para obtener el resultado de su suma, resta, multiplicacion y division");
           System.out.println("Dame el valor del primer numero: ");
           numero1 = input.nextInt();

           System.out.println("Dame el valor del segundo numero: ");
           numero2 = input.nextInt();

           //Realizamos Calculos y mostramos en pantalla

           System.out.println("La suma de estos numeros es: " + (numero1 + numero2));
           System.out.println("La resta de estos numeros es: " + (numero1 - numero2));
           System.out.println("La multiplicacion de estos numeros es: " + (numero1 * numero2));
           System.out.println("La division de estos numeros es: " + (numero1 / numero2));

    }   
}