import java.util.Scanner;

import javax.management.BadAttributeValueExpException;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
      System.out.println("Ingrese un anio: ");
         int num = entrada.nextInt();
     while(num <=1000){
      System.out.println("Ingrese de nuevo un anio: ");
        num = entrada.nextInt();
     }
     boolean esBisiesto = false;

        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
            esBisiesto = true;
        }

        if (esBisiesto) {
            System.out.println(num + " es un año bisiesto.");
        } else {
            System.out.println(num + " no es un año bisiesto.");
        }
    }
  }
      
    
