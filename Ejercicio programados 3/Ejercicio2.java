import java.util.Scanner;

import javax.management.BadAttributeValueExpException;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
      System.out.println("Ingrese un numero entero: ");
         int num = entrada.nextInt();
        
         int doble = num * 2;
         int triple = num * 3;
    
     System.out.println("El doble de el numero ingresado es: " +doble);
     System.out.println("El triple de el numero ingresado es: " +triple);
      }
        }
      
    
