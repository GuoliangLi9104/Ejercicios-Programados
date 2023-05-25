import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int treta = 0;

        System.out.println("Ingrese un número (ingrese el numero 0 para salir):");
           
           do{     
                numero = entrada.nextInt();
               treta += numero ;
            } while(numero != 0);
            System.out.println("La suma de todos los numeros fue: " + treta);
            

    }


    }

        
    
