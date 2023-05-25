import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
//El bucle do-while se repite mientras el número ingresado sea mayor o igual a cero. Cuando se ingresa un número negativo, el bucle se detiene y el programa finaliza.
        do {
            System.out.println("Ingrese un número (ingrese un número negativo para salir):");
            numero =entrada.nextInt();

            if (numero >= 0) {
                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            }
        } while (numero >= 0);
    }


    }

        
    
