import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
            System.out.println("Ingrese un número 1 para continuar o ingrese el numero 0 para salir:");
            numero = entrada.nextInt();

            while(numero != 0){
                System.out.println("Ingrese un número (ingrese el numero 0 para salir):");
                numero = entrada.nextInt();
                if(numero <= 0){
                    System.out.println("El número ingresado es negativo.");
                }else if(numero >= 0 ){
                    System.out.println("El número ingresado es positivo.");
                }
            }
    }


    }

        
    
