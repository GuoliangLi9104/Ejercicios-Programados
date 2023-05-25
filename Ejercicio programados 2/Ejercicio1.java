import java.util.Scanner;

import javax.management.BadAttributeValueExpException;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
      System.out.println("Ingrese un numero: ");
         int num = entrada.nextInt();
         while(num==0){
            System.out.println("Ingrese un numero diferente a cero: ");
        num = entrada.nextInt();
         }
     if(num >= 0){
        System.out.println("El numero es positivo");
     }else{
        System.out.println("El numero es negativo");
     }
         }
        
        }
    
