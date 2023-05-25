import java.util.Scanner;

import javax.management.BadAttributeValueExpException;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
      System.out.println("Ingrese el primer numero: ");
         int a = entrada.nextInt();
         while (a <= 0){
            System.out.println("Ingrese un numero entero: ");
            a = entrada.nextInt();
         }
         System.out.println("Ingrese el segundo numero: ");
         int b = entrada.nextInt();
         while (b <= 0){
            System.out.println("Ingrese un numero entero: ");
            b = entrada.nextInt();
         }
         
         if (a > b){
            System.out.println(a + " Es mayor que " + b);
         }else if (a < b) {
            System.out.println(b + " Es mayor que " + a);
         }else{
            System.out.println(a + " es igual que " + b);
         }
         }
        
        }
    
